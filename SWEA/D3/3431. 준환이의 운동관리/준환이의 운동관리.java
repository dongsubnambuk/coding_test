import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
	
Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        int result =0;
        for (int test_case = 1; test_case <= T; test_case++) {
            int L =sc.nextInt();
            int U =sc.nextInt();
            int X =sc.nextInt();

            if(X>U){
                result = -1;
            }
            else if(X>=L && X<U){
                result = 0;
            }
            else{
                result = L-X;
            }

            System.out.println("#" + test_case+ " " + result);
        }
    }
}