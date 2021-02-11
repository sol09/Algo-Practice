// 746. Min Cost Climbing Stairs

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int[] tmp = new int[2];
        
        tmp[0] = cost[0];
        tmp[1] = cost[1];
        
        for(int i=2;i<n;i++){
            // 삼항연산자 이용해서 더 작은 수를 더함
            tmp[i%2] = cost[i] + ((tmp[(i-2)%2]<tmp[(i-1)%2]) ? tmp[(i-2)%2] : tmp[(i-1)%2]);
        }
        
        return (tmp[0]<tmp[1]) ? tmp[0] : tmp[1];
    }
}
