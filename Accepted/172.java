// 172. Factorial Trailing Zeroes

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        
        if(n==0)
            return 0;
        
        while(n!=0) {
            count += n/5;
            n = n/5;
        }
        
        return count;
    }
}

/* 뒤에 오는 0 개수 세는게 아닌가? 오류 나서 일단 보류 -210321- */
/* 자료형이 int인 것을 잊지말자! int형의 최대 수를 넘어가는 경우에 factorial 값을 구하고 0의 개수를 구하는 방법은 불가능해짐. 0의 개수를 구할 수 있는 다른 방법을 생각해야 함.
   마지막이 0으로 끝나는 경우: 10이 곱해졌을 때. 즉, 2와 5의 공통된 개수만큼 뒤에 0이 생김. 보통 2가 5의 개수보다 많기 때문에 결국 n! 속의 5의 개수를 구하면 됨.
   결과: 시간복잡도 100%, 공간복잡도 94.86%. -210322- */
