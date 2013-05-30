/*
    Implement pow(x, n).

    Time Complexity: O(lgn)
*/

public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function

        //use bit operation. 13 = 1101. x^13 = x^(8+4+1) = x^8 * x^4 * x^1 = x^(2^3) * x^(2^2) * x^(2^0).
        if(n == 0) return 1.0;

        boolean positive = (n < 0) ? false : true;

        n = positive ? n : (0 - n);

        double ret = 1.0;

        for(int m = n ; m > 0; m = (m >> 1), x *= x)
        {
            if((m & 1) == 1)
            {
                ret *= x;
            }
        }

        return (positive) ? ret : (1.0/ret);
    }
}
