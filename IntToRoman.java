public class Solution {
    private String intToRomanDic(int num) {
        switch(num) {
            case 1: return "I";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
            default: return "";
        }
    }

    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num < 0)
        {
            return "";
        }

        int div = 1;

        String out = "";

        while(num > 0)
        {
            int r = num%10;

            if(r == 9 || r == 4)
            {
                out = intToRomanDic(div) + intToRomanDic((r+1)*div) + out;
            }
            else if(r == 0)
            {
                //do nothing
            }
            else
            {
                String digits = "";

                if(r >= 5)
                {
                    digits = intToRomanDic(div*5) + digits;
                }

                r = (r >= 5) ? (r - 5) : r;

                for(int i = 0; i < r; i++)
                {
                    digits += intToRomanDic(div);
                }

                out = digits + out;
            }

            div *= 10;

            num /= 10;
        }

        return out;
    }
}
