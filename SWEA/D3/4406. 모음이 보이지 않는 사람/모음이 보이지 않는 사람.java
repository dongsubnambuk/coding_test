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
        List<String> check = Arrays.asList("a", "e", "i", "o", "u");

        for (int i = 1; i <= T; i++) {
            List<String> word = new ArrayList<>();
            String wordName = sc.next();

            for (int j = 0; j < wordName.length(); j++) {
                word.add(wordName.charAt(j) + "");
            }

            for (int j = 0; j < word.size(); j++) {
                if (check.contains(word.get(j))) {
                    word.remove(j);
                    j--;
                }
            }
            String result = String.join("", word);

            System.out.println("#" + i + " " + result);
        }
    }
}