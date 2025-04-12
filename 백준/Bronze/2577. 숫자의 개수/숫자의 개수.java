import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A, B, C 입력 받기
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        // A, B, C의 곱을 계산
        int sum = A * B * C;

        // sum을 문자열로 변환
        String sumString = String.valueOf(sum);


        int[] counts = new int[10];


        for (int i = 0; i < sumString.length(); i++) {
            char c = sumString.charAt(i);


            if (c >= '0' && c <= '9') {

                int digit = c - '0';
                counts[digit]++;
            }
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
        

    }
}