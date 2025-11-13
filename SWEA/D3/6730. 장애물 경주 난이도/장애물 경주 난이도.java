import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		  Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        List<Integer> block = new ArrayList<>();
        List<Integer> upList = new ArrayList<>();
        List<Integer> downList = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            int up = 0;
            int down = 0;
            block.clear();
            upList.clear();
            downList.clear();
            int N = sc.nextInt();
            for (int j = 0; j < N; j++) {
                int height = sc.nextInt();
                block.add(height);
            }
            for(int j =0; j<N-1; j++) {
                if(block.get(j) < block.get(j+1)){
                    upList.add(block.get(j+1) - block.get(j));
                }
                if(block.get(j) > block.get(j+1)){
                    downList.add(block.get(j) - block.get(j+1));
                }
            }

            if(upList.isEmpty()){
                up = 0;
            }
            else{
                up = upList.stream().max(Integer::compare).get();
            }
            if(downList.isEmpty()){
              down = 0;
            }
            else{
              down = downList.stream().max(Integer::compare).get();
            }

            System.out.println("#" + i +" "+ up + " " + down);
        }
    }
}