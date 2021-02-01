// 704. Binary Search

class Solution {
    public int search(int[] nums, int target) {
        // 정수배열, 타겟 주면 인덱스 반환
        // Is target in nums?
        boolean flag = false;
        int i=0;
        while(i<nums.length) {
            if(nums[i]==target) {
                flag = true;
                break;
            }
            i++;
        }
        
        // What is target's index?
        int index = -1;
        if(flag==true)
            index = i;
        
        return index;
    }
}
