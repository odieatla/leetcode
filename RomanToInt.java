public class Solution {
    private int romanToIntDic(char r) {
        switch(r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int out = 0;

        for(int i = 0; i < s.length(); i++)
        {
            int t = romanToIntDic(s.charAt(i));
            //System.out.println(t);
            if( i+1 < s.length() && t < romanToIntDic(s.charAt(i+1)))
            {
                out -= t;
            }
            else
            {
                out += t;
            }
        }

        return out;
    }
}
