class Solution 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int tot=numBottles;
        int bot=numBottles;
        int ex=0;
        while(bot>=numExchange)
        {
            ex=bot/numExchange;
            bot=bot%numExchange;
            tot+=ex;
            bot+=ex;
        }
        return tot;
    }
}
