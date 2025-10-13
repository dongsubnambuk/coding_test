/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T;
		T = sc.nextInt(); // 테스트 케이스 수 입력

		for (int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); // 현재 테스트 케이스의 수 입력
			
			int[] div = {2, 3, 5, 7, 11};
			int[] result = new int[5];
			
			// 소인수분해 수행
			for (int j = 0; j < div.length; j++) {
				while (N % div[j] == 0) {
					result[j]++;
					N /= div[j];
				}
			}

			// 결과 출력
			System.out.print("#" + test_case + " ");
			for (int k = 0; k < result.length; k++) {
				System.out.print(result[k] + " ");
			}
			System.out.println();
		}
	}
}
