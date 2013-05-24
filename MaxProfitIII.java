/*
Best Time to Buy and Sell Stocks III

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length < 1)
        {
            return 0;
        }

        int buy = prices[0];
        int[] maxp = new int[prices.length];

        for(int i = 1; i < prices.length; i++)
        {
            int cur = prices[i];
            if(cur < buy)
            {
                buy = cur;
            }
            if(cur - buy > maxp[i-1])
            {
                maxp[i] = cur - buy;
            }
            else
            {
                maxp[i] = maxp[i-1];
            }
        }

        int sell = prices[prices.length-1];
        int pt = maxp[prices.length-1];

        for(int i = prices.length-2 ; i > 0; i--)
        {
            int cur = prices[i];
            if(cur > sell)
            {
                sell = cur;
            }
            /*
             if prices[i] < prices[i-1] then maxp[i] = maxp[i-1] => @@@ can use maxp[i] or maxp[i-1]
             if prices[i] > prices[i-1] then i-1,i are in an ascending order.If so, consider they are in one transaction. still the same.
            */
            if(sell - cur + maxp[i-1] > pt)
            {
                pt = sell - cur + maxp[i-1]; //@@@
            }
        }

        return pt;
    }
}

/*
divide and conquer.
find max profit within 0..i, and find max profit from i..n-1.
The max of the sum of these two should be max profit for two trasctions.
first find max profit from 0..i, iterate from beginning and save maxp for each day into an array.-- same as I.
then find max profit from i..n, iterate from end to beginning and calculate with saved maxp array.

Complecity is O(n)
*/
