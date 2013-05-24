/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int maxp = 0;
        
        if(prices.length < 1)
        {
            return 0;
        }
        
        for(int i = 1; i < prices.length; i++)
        {
            int pt = prices[i] - prices[i-1];
            if(pt > 0)
            {
                maxp += pt;
            }
        }
        
        return maxp;
    }
}

/*
    buy at the beginning of an ascending order, and sell at the end of the ascending order.
    for order 1,2,3,4.. it's the same between to buy at 1 then sell at 4 and to buy at 1 then at 2 then buy at 2 then sell at 3 then buy at 3 then sell at 4..
*/
