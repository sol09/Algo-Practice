// 746.

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // [0,1,2,3,4,5,6,7,8,9,10,11]
        int sum = 0;
        int i=0;
        
        while(i<cost.length-2) {
            if(cost[i]>=cost[i+1]) {
                i+=2;
                sum+=cost[i+1];
            }
            else {
                i+=1;
                sum+=cost[i];
            }
        }
        
        if(cost[cost.length-2]>=cost[cost.length-1])
            sum+=cost[cost.length-1];
        else
            sum+=cost[cost.length-2];
        
        return sum;
    }
}
