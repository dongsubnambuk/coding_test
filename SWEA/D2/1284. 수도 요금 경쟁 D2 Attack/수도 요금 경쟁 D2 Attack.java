import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String[] args) {

        //A사: 1리터 당 P원 -> W * P
        //B사: R리터 이하이면 Q원, 이상이면 1리터당 S원
        //W: 한 달간 사용하는 수도의 양 리터

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int [] result = new int[2];

        for (int i = 1; i <= T; i++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            for (int j = i; j <= T; j++) {
                result[0] =  W * P;

                if (W < R) {
                    result[1] = Q;
                } else if (W > R) {
                    result[1] = ((W - R) * S) + Q;
                } else { // W == R인 경우 추가
                    result[1] = Q;
                }
            }

            System.out.println("#" + i + " " + Arrays.stream(result).min().getAsInt());
        }

        sc.close();
    }
}
