// 1051. Height Checker

// 210402
class Solution {
    public int heightChecker(int[] heights) {
        //int[] tmp = new int(heights.length);
        //HashMap<Integer,Integer> map = new HashMap<>();
        
        int[] copyarr = Arrays.copyOf(heights,heights.length);
        int count = 0;
        Arrays.sort(heights);
        for(int i=0; i<heights.length; i++) {
            if(copyarr[i]!=heights[i])
                count++;
        }
        
        return count;
    }
}

/* 시간 100%, 공간 76.28% */
