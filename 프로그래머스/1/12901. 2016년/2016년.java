import java.util.*;
class Solution {
    public String solution(int a, int b) {
        int year = 2016;
        
         Calendar calendar = Calendar.getInstance();
       calendar.set(year, a-1, b);

       int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

       String answer ="";
       switch (dayOfWeek) {
           case Calendar.SUNDAY:
               answer = "SUN";
               break;
           case Calendar.MONDAY:
               answer = "MON";
               break;
           case Calendar.TUESDAY:
               answer = "TUE";
               break;
           case Calendar.WEDNESDAY:
               answer = "WED";
               break;
           case Calendar.THURSDAY:
               answer = "THU";
               break;
           case Calendar.FRIDAY:
               answer = "FRI";
               break;
           case Calendar.SATURDAY:
               answer = "SAT";
               break;
       }
        
        return answer;
        
    }
}