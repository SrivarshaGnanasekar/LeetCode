class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int minimumPrice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            profit=Math.max(profit,prices[i]-minimumPrice);
            minimumPrice=Math.min(minimumPrice,prices[i]);
        }
        return profit;
    }
}
