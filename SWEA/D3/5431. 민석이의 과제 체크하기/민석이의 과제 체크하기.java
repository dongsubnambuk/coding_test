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
        List<Integer> class_num = new ArrayList<>();
        List<Integer> check = new ArrayList<>();

        // N명까지
        // K : 과제 제출 사람 번호
        for (int i = 1; i <= T; i++) {
            class_num.clear();
            check.clear();

            int N = sc.nextInt();
            int apply = sc.nextInt();

            for (int j = 0; j < apply; j++) {
                check.add(sc.nextInt());
            }

            for (int j = 1; j <= N; j++) {
                class_num.add(j);
            }

	     for (int j = class_num.size() - 1; j >= 0; j--) {
                for (int k = 0; k < check.size(); k++) {
                    if (class_num.get(j).equals(check.get(k))) {
                        class_num.remove(j);
                        break; // 이 자리 지웠으니 더 볼 필요 없음
                    }
                }
            }
  System.out.print("#" + i + " ");
            for (int n : class_num) {
                System.out.print(n + " ");
            }
            System.out.println();

            }
          
        }
    }
