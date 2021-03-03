// 202. Happy Number

//HashSet 사용
class Solution {
    public boolean isHappy(int n) {
        boolean flag = false;
        
        // 중복 판별 위해 HashSet 사용
        HashSet<Integer> set = new HashSet<Integer>();
        
        // 제곱 -> Math.pow(n,x);
        int sum = 0;
        int a;
        while(true) {
            set.add(n);
            if(n==1)
                return true;
            while(n!=0) {
                a = n%10;
                sum += Math.pow(a,2);
                n = n/10;
            }
            n = sum;
            if(set.contains(n))
                break;
        }
        
        return flag;
    }
}

/* HashSet 없이 했을 때 TimeLimit이 걸려서 중복을 피하기 위해 HashSet을 썼더니 MemoryLimit이 걸렸다.. 방법 고안해서 다시 풀어볼 것. */
