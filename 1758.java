class Solution 
{
    public int minOperations(String s) 
    {
        int n = s.length();
        int count01 = 0; 
        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 0) {
                if (s.charAt(i) != '0') count01++;
            } else {
                if (s.charAt(i) != '1') count01++;
            }
        }
        return Math.min(count01, n - count01);
    }
}
