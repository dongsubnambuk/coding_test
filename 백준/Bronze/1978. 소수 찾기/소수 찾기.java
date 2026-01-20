import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        
        // 소수는 1과 자기 자신의 숫자로만 나누어 떨어지는 수
        // 

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num < 2) continue; 

            boolean isPrime = true;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) cnt++;
        }

        System.out.println(cnt);
    }
}
