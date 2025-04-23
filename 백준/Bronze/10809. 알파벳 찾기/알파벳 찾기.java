import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();


        int [] arr = new int[26];
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result= S.indexOf((char)('a' + i));
            System.out.print(result+" ");
        }

    }

    }


