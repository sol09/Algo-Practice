// 31. Next Permutation

class Solution {
    public void nextPermutation(int[] nums) {
        // 이해를 돕기 위한 예시배열: nums = [2,4,3,2,2]
        int i = nums.length-1;
        int j;
        
        // 배열 뒤부터 탐색
        while(i>0 && nums[i-1]>=nums[i]) {
            i--;
        }
        
        // swap 할 값 탐색
        if(i!=0) {
            j = nums.length-1;
            while(nums[j]<=nums[i-1]) {
                j--;
            }
            swap(nums,i-1,j);
        }
        
        // 배열 뒤집기
        int s = i;
        int e = nums.length-1;
        while(s<e) {
            swap(nums,s++,e--);
        }
    }
    
    public void swap(int[] array, int n, int m) {
        int temp;
        temp = array[n];
        array[n] = array[m];
        array[m] = temp;
    }
}
