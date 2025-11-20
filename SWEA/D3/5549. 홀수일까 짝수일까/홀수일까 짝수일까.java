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
        String result = "";
        List<Integer> list = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            list.addAll(Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));

            for (int i = 0; i < list.size(); i++) {
                if(list.get(list.size()-1)%2==0){
                    result = "Even";
                }
                else{
                    result = "Odd";
                }
            }



            System.out.println("#" + t + " " + result);
        }
        sc.close();
    }
}