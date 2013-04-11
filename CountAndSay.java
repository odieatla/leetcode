public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0) 
        {
            return "";
        }
        if(n == 1) 
        {
            return "1";
        }
        
        String out = countAndSay(n-1);
        String finals = "";
        
        for(int i = 0; i < out.length(); )
        {
            String tmp = "";
            for(int j = i;j < out.length(); j++ )
            {
                int size = 0;
                if(out.charAt(j) == out.charAt(i))
                {
                    size = j - i + 1;
                    tmp = Integer.toString(size) + Character.toString(out.charAt(i));
              
                    if(j == out.length() - 1) //IMPORTANT! eg, "11", otherwise i wont reach out.length()
                    {
                        i = j + 1;
                        break;
                    }
                }
                else
                {
                    i = j;
                    break;
                }
            }
          
            finals += tmp;
        }
        
        return finals;
    }
}
