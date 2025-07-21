import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] answer = {};
        
       List<Integer> result = new ArrayList<>();
        int [] count = {0,0,0};
        int [] mp1 ={1, 2, 3, 4, 5};
        int [] mp2 ={2, 1, 2, 3, 2, 4, 2, 5};
        int [] mp3 ={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (mp1[i% mp1.length] == answers[i]) {
                count[0]++;
            }

            if (mp2[i% mp2.length] == answers[i]) {
                count[1]++;
            }

            if (mp3[i% mp3.length] == answers[i]) {
                count[2]++;
            }

        }



       for (int i = 0; i < count.length; i++) {
           if(count[i]==Arrays.stream(count).max().getAsInt()){
               result.add(i+1);
           }
       }
        
        return result;
    }
}