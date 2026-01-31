import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac*=i;
        }
        System.out.println(fac);
    }
}
