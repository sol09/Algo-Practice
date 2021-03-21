// 172. 

class Solution {
    public int trailingZeroes(int n) {
        int num = factorial(n);
        int count = 0;
        if(num==0)
            return 0;
        
        while(true) {
            if(num%10 == 0) {
                count++;
                num = num/10;
            }
            else
                return count;
        }
    }
    
    public int factorial(int n) {
        if(n==0)
            return 0;
        int re = 1;
        for(int i=n; i>0; i--) {
            re = re*i;
        }
        return re;
    }
}

/* 뒤에 오는 0 개수 세는게 아닌가? 오류 나서 일단 보류 */
