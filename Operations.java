class Solution 
{
    public int minOperations(String s) 
    {
        int n = s.length();
        int count01 = 0; 
        for (int i = 0; i < n; i++) 
        {
            // In a '0101...' pattern:
            // even indices (0, 2, 4...) should be '0'
            // odd indices (1, 3, 5...) should be '1'
            if (i % 2 == 0) {
                if (s.charAt(i) != '0') count01++;
            } else {
                if (s.charAt(i) != '1') count01++;
            }
        }

        // The cost for the opposite pattern ('1010...') is always (n - count01).
        // We return the minimum of the two.
        return Math.min(count01, n - count01);
    }
}
