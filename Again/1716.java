// 1716. Calculate Money in Leetcode Bank
/*  월요일을 첫날로 해서 1달러에서 시작해 매일 1달러씩 증가하면서 저축, 일주일 늘어날 때마다 저번주 같은요일보다 1달러 더 저축, 총 저축한 달러 반환. */

// 210409
class Solution {
    public int totalMoney(int n) {
        int count=1;
        int re=0;
        
        while(count<=n) {
            if(count%7==0)
                re += 7+(count/7)-1;
            else
                re += (count%7) + (count/7);
            count++;
        }
        
        return re;
    }
}

/* 쉬운 문제지만 효율이 별로.. 시간 54.61%, 공간 49.27%, Greedy 토픽이 있으니 이걸 이용해서 다시 풀어볼 것. */
