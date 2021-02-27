// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length/2;
        
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j]==nums[i])
                    count++;
            }
            if(count>majority)
                return nums[i];
        }
        
        return -1;
    }
}

/* 210227 첫번째 시도. 패스는 했으나 시간이 너무 많이 걸림(하위 5%). for문을 두번 써서 시간 복잡도가 증가한 듯. 다른 방법을 생각해서 다시 풀어볼 것.
 */
