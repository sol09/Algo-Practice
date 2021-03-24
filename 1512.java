// 1512.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int all = 0;
        
        for(int n : nums) {
            if(!map.containsKey(n)) {
                map.put(n,1);
            }
            else {
                int count = map.get(n);
                count++;
                map.put(n,count);
            }
        }
        
        for(int k : map.keySet()) {
            int v = map.get(k);
            all += (v*(v-1)/2);
        }
        
        return all;
    }
}


/* 1번 문제랑 비슷한 느낌. 비슷하게 풀었더니 마찬가지로 시간은 좋게 나왔는데 공간이 별로 안 좋음. 시간 100%, 공간 26.25%. 다른 방법 찾아볼 것. -210324- */
