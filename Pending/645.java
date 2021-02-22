//645. 

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] re = new int[2];
        int tmp = -1;
        
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==nums[i-1]) {
                re[0] = nums[i];
                if(nums[0]>nums[i])
                    tmp = (nums[i]==(nums.length-i))? i+1 : nums[i]-1;
                else
                    tmp = (nums[i]==i+1)? i : i+1;
                re[1] = tmp;
                break;
            }
        }
        
        return re;
    }
}
