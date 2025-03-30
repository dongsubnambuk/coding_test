import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에는 입력받을 숫자의 개수를 입력받아야함

        //라인단위로 입력받기(Enter를 경계)

        // 정수형 입력이라면, 형변환 필수
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=Integer.parseInt(str[i]);
        }
        System.out.println(sum);
        br.close();

    }
}