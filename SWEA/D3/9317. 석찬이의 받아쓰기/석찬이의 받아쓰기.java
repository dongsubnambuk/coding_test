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


        for (int i = 1; i <= T; i++) {
            int cnt = 0;
            List<String> correctList = new ArrayList<>();
            List<String> answerList = new ArrayList<>();
            int N = sc.nextInt();
            String correct = sc.next();
            String answer = sc.next();

            for (int j = 0; j < N; j++) {
                correctList.add(correct.charAt(j) + "");
                answerList.add(answer.charAt(j) + "");
            }
            for(int j =0; j<N; j++){
                if(correctList.get(j).equals(answerList.get(j))){
                    cnt++;
                }
            }
            System.out.println("#" + i + " " + cnt);
        }
    }
}