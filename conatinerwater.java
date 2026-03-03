class Solution 
{
    public int maxArea(int[] height) 
    {
       int left = 0;
       int right = height.length - 1;
       int max_area = 0;
       int current_height=0;
       int current_width=0;
       int current_area=0;
       while(left < right)
       {
        current_height = Math.min(height[left], height[right]);
        current_width = right - left;
        current_area = current_height * current_width;
        if(current_area > max_area)
            max_area = current_area;
        if(height[left] < height[right])
            left += 1;
        else
            right -= 1;
       } 
    return max_area;
    }
}
