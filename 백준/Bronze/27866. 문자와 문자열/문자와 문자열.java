import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     //문자열 입력 받기
     String a = br.readLine();

     //정수 입력 받기
     int n = Integer.parseInt(br.readLine())-1;

     //chatAt() => 문자열의 n번째 문자를 출력하는 함수
        System.out.println(a.charAt(n));


    }
}