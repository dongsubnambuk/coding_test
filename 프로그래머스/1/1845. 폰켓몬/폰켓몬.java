import java.util.*;
class Solution {
    public int solution(int[] nums) {
 int max = nums.length /2;

    Set<Integer> set = new HashSet<>();
    HashMap<String, Integer> map = new HashMap<>();

    for(int i=0;i<nums.length;i++){
        for(int j=0;j<=i;j++) {
            set.add(nums[j]);
        }
    }

    for (int j: set) {
        map.put(String.valueOf(j), 1);
    }



    int answer =0;
    for (int i=0;i<map.size();i++){
        if(map.get(nums[i]+"")>0 && answer < max){
            answer++;
        }
    }
        return answer;
    }
}