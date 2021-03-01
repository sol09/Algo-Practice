// 169. Majority Element

// for문 사용
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
// 210227 첫번째 시도. 패스는 했으나 시간이 너무 많이 걸림(하위 5%). for문을 두번 써서 시간 복잡도가 증가한 듯. 다른 방법을 생각해서 다시 풀어볼 것.


// Hash Map 이용하기
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> count = countNums(nums);
        
        int max=0;
        int num=-1;
        
        for(int i=0; i<nums.length; i++) {
            if(max<count.get(nums[i])) {
                max = count.get(nums[i]);
                num = nums[i];
            }
        }
        
        return num;
    }
    
    public Map<Integer,Integer> countNums(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
                map.put(nums[i],map.get(nums[i])+1);
        }
        
        return map;
    }
}
// 210301 두번째 시도. 통과했으나 시간(하위 18%)과 공간(하위 58.29%) 모두 애매함. 다른 방법이 있는지 더 생각해볼 것. -> Topic에 있는 Bit Manipulation로 풀어보기
