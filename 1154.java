// 1154

class Solution {
    public int dayOfYear(String date) {
        // 특수문자 제거
        String dateStr = date.replace("-","");
        
        int year = Integer.parseInt(dateStr.substring(0,4));
        int month = Integer.parseInt(dateStr.substring(4,6));
        int day = Integer.parseInt(dateStr.substring(6));
        int days = 0;
        for(int i=0; i<month; i++) {
            if(i%2==1)
                days += 31;
            else if(i==2)
                days += 28;
            else if(i%2==0)
                days += 30;
        }
        
        if(year%4==0)
            days++;
        
        days += day;
        
        return days;
    }
}
