/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*/
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

    //better solution
    public int maxProfit(int[] prices)
    {
        if(prices.length < 1)
        {
          return 0;
        }

        int buy = prices[0];
        int maxp = 0;

        for(int i = 0; i < prices.length; i++)
        {
            int cur = prices[i];
            if(cur < buy)
            {
                buy = cur;
            }
            if(cur - buy > maxp)
            {
                maxp = cur - buy;
            }
        }

        return maxp;
    }
}
