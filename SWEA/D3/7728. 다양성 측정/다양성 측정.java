import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= T; i++) {
            //숫자를 하나씩 짤라서 리스트에 넣기
            numbers.clear();
            numbers.addAll(Arrays.stream(sc.next().split("")).map(Integer::parseInt).distinct().collect(Collectors.toList()));

            System.out.println("#" + i + " " + numbers.size());
        }
    }
}