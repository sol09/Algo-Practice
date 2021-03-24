// 1512.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int all = 0;
        
        for(int n : nums) {
            if(!map.containsValue(n)) {
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
