// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i],i);
        }
        
        int[] re = new int[2];
        int index=0;
        
        while(true) {
            int tg = target - nums[index];
            if(map.containsKey(tg) && map.get(tg)!=index) {
                re[0]=index;
                re[1]=map.get(tg);
                break;
            }
            index++;
        }
        
        return re;
    }
}

/* 이전보단 HashMap을 자유롭게 쓸 수 있게 됨. 시간 31%, 공간 97% */
