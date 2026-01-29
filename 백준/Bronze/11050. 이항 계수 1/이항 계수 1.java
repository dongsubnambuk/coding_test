import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //이항 계수 -> 조합에서 사용됨 쉽게 말하면 nCk 이런느낌임
        //n!/(n-k)!k! 이 식임
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(factorial(N)/(factorial(K)*factorial(N-K)));
    }

    public static int factorial(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }
}
