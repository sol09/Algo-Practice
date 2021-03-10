// 202. Happy Number

// 210303 - while문 2번 사용
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




// 210310 - 함수 사용
class Solution {
    int sum = 0;
    
    public boolean isHappy(int n) {
        // 중복 판별 위해 HashSet 사용
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        
        while(true) {
            pow(n);     // replace num by sum of squares of digits
            if(sum==1)  // when 1
                return true;
            if(set.contains(sum))   // sum appeared before
                return false;
            set.add(sum);
            n = sum;
            sum = 0;
        }
    }
    
    public void pow(int n) {
        int tmp;
        while(n!=0) {
            tmp = n%10;
            sum += Math.pow(tmp,2);
            n = n/10;
        }
    }
}

/* 이전과 비슷하지만 기존의 중첩 while문 중 하나를 함수로 빼서 코드를 작성함. 시간 약 86%, 공간 약 81% */
