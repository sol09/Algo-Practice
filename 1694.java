// 1694. Reformat Phone Number

class Solution {
    public String reformatNumber(String number) {
        String nNum = "";
        number = number.replaceAll("[- ]","");
        
        while(number.length()>1) {
            switch(number.length()) {
                case 1:
                    break;
                case 2:
                    nNum = nNum + number;
                    number = "";
                    break;
                case 3:
                    nNum = nNum + number;
                    number = "";
                    break;
                case 4:
                    nNum = nNum + number.substring(0,2) + "-";
                    number = number.substring(2);
                    break;
                default:
                    nNum = nNum + number.substring(0,3) + "-";
                    number = number.substring(3);
                    break;
            }
        }
        
        return nNum;
    }
}

/* 통과는 했는데.. 시간은 하위 26%, 공간은 하위 14%.. 다른 방법은 뭐가 있지? */
