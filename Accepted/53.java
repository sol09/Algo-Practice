53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        int max = sums[0];
        for(int i=1;i<nums.length;i++) {
            if(sums[i-1]<0)
                sums[i-1] = 0;
            sums[i] = sums[i-1]+nums[i];
            if(max<sums[i])
                max = sums[i];
        }
        
        return max;
    }
}
