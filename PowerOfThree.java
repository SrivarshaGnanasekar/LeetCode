class Solution 
{
    public boolean isPowerOfThree(int n) 
    {
        if(n<=0)
        {
            return false;
        }
        int temp=n;
        boolean flag=false;
        while(temp%3==0)
        {
            temp=temp/3;
        }
        if(temp!=1)
        {
            return false;
        }
        return true;
    }
}
