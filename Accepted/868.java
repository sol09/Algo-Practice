//868, Binary Gap

class Solution {
    public int binaryGap(int n) {
        // 2진수
        int[] bin = new int[32];
        int a=0;
        for(int i=0; i<32; ++i) {
            if(((n>>i)&1)!=0)
                bin[a++] = i;
        }
        
        // binary gap의 최대값
        int max=0;
        for(int i=0; i<a-1; ++i)
            max = Math.max(max,bin[i+1]-bin[i]);
        
        return max;
    }
}

// 비트연산이 익숙하지가 않아서 아직은 어려움. 앞으로 관련 문제를 더 풀어보면서 익숙해지게 할 것. 시간,공간적으로 좋은 결과가 나옴.
