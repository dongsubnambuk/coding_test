import java.io.BufferedReader;      // 문자 입력 스트림에서 텍스트를 효율적으로 읽기 위한 클래스 임포트
import java.io.InputStreamReader;   // 바이트 스트림을 문자 스트림으로 변환하기 위한 클래스 임포트
import java.io.IOException;         // 입출력 예외 처리를 위한 클래스 임포트
import java.util.StringTokenizer;   // 문자열을 토큰(부분 문자열)으로 나누기 위한 클래스 임포트

public class Main {                 // Main 클래스 선언 시작
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 콘솔에서 입력을 받기 위한 BufferedReader 객체 생성

        String str = br.readLine();  // 한 줄의 텍스트를 읽어와서 str 변수에 저장
        StringTokenizer st = new StringTokenizer(str, " ");  // 공백을 기준으로 문자열을 토큰으로 나누는 StringTokenizer 생성

        double n = Integer.parseInt(st.nextToken());
        double m = Integer.parseInt(st.nextToken());
        double result = 0;

        result=n/m;

        System.out.println(result); // result 값을 콘솔에 출력

    }
}