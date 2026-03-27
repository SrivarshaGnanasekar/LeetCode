class Solution 
{
    public int reverse(int x) 
    {
        String s = String.valueOf(Math.abs((long)x)); 
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        try 
        {
            int result = Integer.parseInt(sb.toString());
            return (x < 0) ? -result : result;
        }
         catch (NumberFormatException e) 
         {
            return 0;
        }
    }
}
