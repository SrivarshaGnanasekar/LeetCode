class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : nums)
        {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        int max=0;
        for(int val: map.values())
        {
            if(val>max)
            {
                max=val;
            }
        }
        int tot=0;
        for(int val: map.values())
        {
            if(val==max)
            {
                tot=tot+val;
            }
        }
        return tot;
    }
}
