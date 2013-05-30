public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x < 0)
        {
            return false;
        }

        int div = 1;

        while(x/div >= 10) //watch out 1001, 101, cannot use multiple => overflow
        {
            div *= 10;
        }

        while(x > 0)
        {
            int last = x%10;
            int first = x/div;

            if(first - last != 0)
            {
                return false;
            }

            x = (x%div)/10;
            div /= 100;
        }

        return true;
    }
}
