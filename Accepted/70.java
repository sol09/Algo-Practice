// 70. Climbing Stairs

class Solution {
    public int climbStairs(int n) {
        // 계단수 n, 1이나2씩만 올라가기 가능. 끝까지 가는 방법 가짓수 구하기
        
        int[] t = new int[3];
        t[1] = 1;
        t[2] = 2;
        
        for(int i=3;i<=n;i++)
            t[i%3] = t[(i-1)%3]+t[(i-2)%3];
        
        return t[n%3];
    }
}
