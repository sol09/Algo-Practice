// 13

class Solution {
    public int romanToInt(String s) {
        char[] rom = {'M','D','C','L','X','V','I'};
        int [] num = {1000,500,100,50,10,5,1};
        int answer = 0; 
        
        for(int i= 0; i<s.length();++i) {
                for(int j = 0; j<rom.length;j++) {
                    if(s.charAt(i) == rom[j]) {
                        if(i+1 < s.length()) {
                            if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                                answer += 900;
                                i++;
                                break;
                            }
                            else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                                answer += 400;
                                i++;
                                break;
                            }
                            else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                                answer += 90;
                                i++;
                                break;
                            }
                            else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                                answer += 40;
                                i++;
                                break;
                            } 
                            else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                                answer += 9;
                                i++;
                                break;
                            } 
                            else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                                answer += 4;
                                i++;
                                break;
                            }
                        }
                        answer += num[j];
                    }
                }
            }
        return answer;
    }
}
