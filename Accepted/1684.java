// 1684. 

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        
        for(char c:allowed.toCharArray()) {
            set.add(c);
        }
        
        for(String word:words) {
            boolean isConsistent = true;
            for(char c:word.toCharArray()) {
                if(!set.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) {
                count++;
            }
        }
        
        return count;
    }
}

/* 효율은 무난한 편. 시간 68%, 공간 72%. */
