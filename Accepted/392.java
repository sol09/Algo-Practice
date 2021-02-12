// 392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        char[] str = new char[s.length()];
        
        for(i=0;i<s.length();i++) {
            while(j<t.length()) {
                if(s.charAt(i)==t.charAt(j)) {
                    str[i]=s.charAt(i);
                    j++;
                    break;
                }
                j++;
            }
            if(j==t.length())
                break;
        }
        
        String re = new String(str);
        
        if(re.equals(s))
            return true;
        else
            return false;
    }
}
