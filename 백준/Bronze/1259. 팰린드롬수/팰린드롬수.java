import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String result = "";
        while(true){
            int N = sc.nextInt();
            if(N==0){
                break;
            }

            String str = String.valueOf(N);
            String reverseN = new StringBuilder(str).reverse().toString();
            int reversedN = Integer.parseInt(reverseN);
            if(N == reversedN){
                result = "yes";
            }
            else{
                result = "no";
            }
            System.out.println(result);
        }
    }
}
