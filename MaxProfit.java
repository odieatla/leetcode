public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
        {
            return 0;
        }

        int buy = prices[0];
        int maxp = prices[1] - buy;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i-1] < buy)
            {
                buy = prices[i-1];
            }
            if(prices[i] - buy > maxp)
            {
                maxp = prices[i] - buy;
            }
        }

        return maxp > 0 ? maxp : 0; //if less than 0, then same day buy and sell
    }
}
