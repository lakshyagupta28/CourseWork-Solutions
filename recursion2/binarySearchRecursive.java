public class Solution {

    public static int bs(int[]nums,int s,int e,int target)
    {
        if(s>e)
        {
            return -1;
        }
        else
        {
            int mid=(s+e)/2;
            if(target==nums[mid])
            return mid;
            else if(target>nums[mid])
            {
                return bs(nums,mid+1,e,target);
            }
            else
            {
                return bs(nums,s,mid-1,target);
            }
        }
    }
    public static int search(int []nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
}
