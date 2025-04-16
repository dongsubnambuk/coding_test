import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

       String result ="";
       for (int i = 0; i < n.length-1; i++) {
            if (n[i] == n[i+1]-1) {
                result ="ascending";
            }

           else if(n[i] == n[i + 1]+1) {
               result = "descending";
           }
           else {
                result = "mixed";
                break;
            }
       }

        System.out.println(result);

    }


}