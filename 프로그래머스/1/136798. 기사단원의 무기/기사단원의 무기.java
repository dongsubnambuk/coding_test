import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
       int answer = 0;
       List<Integer> result = new ArrayList<>();
       int count =0;

       for (int i = 1; i <= number ; i++) {
           count =0;
           for (int j = 1; j*j <= i; j++) {
               if (j * j == i)
                   count++;
               else if(i % j ==0) count+=2;
           }
           result.add(count);

       }

       for (int i = 0; i < result.size(); i++) {
           if(result.get(i) > limit){
               result.set(i,power);
           }
           answer +=result.get(i);
       }
        
        return answer;
    }
}