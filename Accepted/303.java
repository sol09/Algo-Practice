// 303. Range Sum Query

class NumArray {
    private int[] arr;

    public NumArray(int[] nums) {
        this.arr = nums;
    }
    
    public int sumRange(int i, int j) {
        // i,j는 index
        int sum = 0;
        
        for(int k=i;k<=j;k++) {
            sum += arr[k];
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
 
// 시간복잡도가 하위 20프로대 -> 다른 방법 찾아서 공부해보고 비슷한류에 적용시킬 수 있게 하기
