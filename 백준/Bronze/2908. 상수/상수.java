import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A = sc.nextInt();
        int B = sc.nextInt();

        A=Integer.parseInt(sb.append(A).reverse().toString());
        sb.setLength(0);
        B=Integer.parseInt(sb.append(B).reverse().toString());

        int result = Math.max(A, B);
        System.out.println(result);
    }
}
