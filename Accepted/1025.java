// 1025. Divisor Game

class Solution {
    public boolean divisorGame(int N) {
        // if x가 N의 약수 -> N-x
        int count=0;
        
        while(N!=1) {
            for(int i=1;i<=N;i++) {
                if(N%i==0) {
                    int x = i;
                    N-=x;
                    count+=1;
                    break;
                }
            }
        }
        
        if(count%2==0)
            return false;
        else
            return true;
    }
}
