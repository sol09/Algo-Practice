// 268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        for(int i=0;i<n;i++) {
            sum += nums[i];
        }
        
        int re = n*(n+1)/2;
        
        return (re-sum);
    }
}
