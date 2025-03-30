import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //라인단위로 입력받기(Enter를 경계)
        // 정수형 입력이라면, 형변환 필수
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        System.out.println(A+B-C);
        //형변환 함수
        String sum = Integer.toString(A)+Integer.toString(B);
        String c = Integer.toString(C);
        int result = Integer.parseInt(sum)-C;
        System.out.println(result);

    }
}