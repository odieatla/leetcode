public class Solution {
    public int revert(int x) {
        if(x == 0)
        {
            return 0;
        }

        int flag = 1;

        if(x < 0)
        {
            flag = -1;
        }

        int out = 0;

        int y = x * flag;

        while(y > 0)
        {
            out = out * 10 + y%10;

            y = y/10;
        }

        return out * flag;
    }
}
