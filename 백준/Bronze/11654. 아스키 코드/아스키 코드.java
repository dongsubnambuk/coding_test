import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte num=(byte)br.readLine().charAt(0); // 입력된 문자열의 첫 번째 문자를 읽어와 byte 형으로 변환
        //아스키코드로 변환
        System.out.print(num);
    }
}