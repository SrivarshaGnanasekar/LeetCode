class Solution 
{
    public boolean hasAllCodes(String s, int k) 
    {
    int totalNeeded = 1 << k;
    boolean[] found = new boolean[totalNeeded];
    int count = 0;
    int currentHash = 0;
    int mask = totalNeeded - 1;
    for (int i = 0; i < s.length(); i++) 
    {
        currentHash = ((currentHash << 1) | (s.charAt(i) - '0')) & mask;
        if (i >= k - 1)
        {
            if (!found[currentHash]) 
            {
                found[currentHash] = true;
                count++;
                if (count == totalNeeded) return true;
            }
        }
    }
    return false;
}
}
