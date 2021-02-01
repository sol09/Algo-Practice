// 13. Roman to Integer - #Math #String

class Solution {
    public int romanToInt(String s) {
        // 로마숫자 정수로 바꾸기
        // 큰 수부터 씀
        int re = 0;
        int i = 0;
        
        while(i<s.length()) {
            switch(s.charAt(i)) {
                case 'M':
                    re+=1000;
                    break;
                case 'D':
                    re+=500;
                    break;
                case 'C':
                    if(i+1<s.length() && s.charAt(i+1)=='M') {re+=900; i++;}
                    else if(i+1<s.length() && s.charAt(i+1)=='D') {re+=400; i++;}
                    else re+=100;
                    break;
                case 'L':
                    re+=50;
                    break;
                case 'X':
                    if(i+1<s.length() && s.charAt(i+1)=='C') {re+=90; i++;}
                    else if(i+1<s.length() && s.charAt(i+1)=='L') {re+=40; i++;}
                    else re+=10;
                    break;
                case 'V':
                    re+=5;
                    break;
                case 'I':
                    //if(i+1!=s.length())
                    if(i+1<s.length() && s.charAt(i+1)=='X') {re+=9; i++;}
                    else if(i+1<s.length() && s.charAt(i+1)=='V') {re+=4; i++;}
                    else re+=1;
                    break;
            }
            i++;
        }
        
        return re;
    }
}
