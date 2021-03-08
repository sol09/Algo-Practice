// 1694. Reformat Phone Number

// 210305 switch문 이용
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




// 210308 while문, if문 이용
class Solution {
    public String reformatNumber(String number) {
        String nNum = "";
        number = number.replaceAll("[- ]","");
        
        while(number.length()>4) {
            nNum += number.substring(0,3) + "-";
            number = number.substring(3);
        }
        
        if(number.length()==4)
            nNum += number.substring(0,2) + "-" + number.substring(2,4);
        else
            nNum += number;
        
        return nNum;
    }
}

/* 여전히 좋지 않은 시간, 공간복잡도.. 시간은 15.2%, 공간은 38.3%. 어떻게 해야 효율적일지 더 생각해보기 */
