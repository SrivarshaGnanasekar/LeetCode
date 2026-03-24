import java.util.Arrays;
class Solution
 {
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
       Arrays.sort(arr);
       int diff=arr[1]-arr[0];
       boolean flag=true;
       for(int i=2;i<arr.length;i++)
       {
        if(diff!=(arr[i]-arr[i-1]))
        {
           flag=false;
        }
       }
    return flag;
    }
}
