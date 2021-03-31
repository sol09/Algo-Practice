// 1154. Day of the Year

class Solution {
    public int dayOfYear(String date) {
        // 특수문자 제거
        String dateStr = date.replace("-","");
        
        int year = Integer.parseInt(dateStr.substring(0,4));
        int month = Integer.parseInt(dateStr.substring(4,6));
        int day = Integer.parseInt(dateStr.substring(6));
        int days = 0;
        for(int i=1; i<=month; i++) {
            switch(i) {
                case 1:
                    days += 0;
                    break;
                case 2:
                    days += 31;
                    break;
                case 3:
                    days += 28;
                    break;
                case 4:
                    days += 31;
                    break;
                case 5:
                    days += 30;
                    break;
                case 6:
                    days += 31;
                    break;
                case 7:
                    days += 30;
                    break;
                case 8:
                    days += 31;
                    break;
                case 9:
                    days += 31;
                    break;
                case 10:
                    days += 30;
                    break;
                case 11:
                    days += 31;
                    break;
                case 12:
                    days += 30;
                    break;
            }
        }
        
        if(year%4==0 && year%100!=0 && month>=3)
            days++;
        
        days += day;
        
        return days;
    }
}

/* 시간 53.09%, 공간 90.73% */
