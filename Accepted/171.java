// 171. Excel Sheet Column Number
 
class Solution {
    public int titleToNumber(String s) {
        // 'A'=65->1;
        int re = 0;
        int count = 0;
        
        for(int i=s.length()-1;i>=0;i--) {
            switch(count) {
                case 0:
                    re += ((int)s.charAt(i) - 64);
                    break;
                default:
                    re += Math.pow(26,count) * ((int)s.charAt(i) - 64);
                    break;
            }
            count++;
        }
        
        return re;
    }
}
