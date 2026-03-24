import java.util.Arrays;
class Solution 
{
    public int[] successfulPairs(int[] spells, int[] potions, long success) 
    {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) 
        {
            int low = 0;
            int high = m - 1;
            int firstValidIndex = m; 
            while (low <= high)
             {
                int mid = low + (high - low) / 2;
                if ((long) spells[i] * potions[mid] >= success) 
                {
                    firstValidIndex = mid;
                    high = mid - 1; 
                } 
                else 
                {
                    low = mid + 1;
                }
            }
            pairs[i] = m - firstValidIndex;
        }
        
        return pairs;
    }
}
