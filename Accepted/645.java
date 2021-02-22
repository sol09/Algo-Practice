//645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] re = new int[2];
        
        //sorting
        Arrays.sort(nums);
        
        int a=-1, b=1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i]==nums[i-1])
                re[0] = nums[i];
            else if (nums[i] > nums[i-1]+1)
                b = nums[i-1]+1;
        }
        
        if(nums[nums.length-1]!=nums.length)
            b = nums.length;
        
        re[1] = b;
        
        return re;
    }
}

/* 문제 토픽에 Hash Table 이 있는데 사용하지 않았다. Hash Table 을 이용해서도 풀어볼 것.
*/
