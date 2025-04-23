import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String[]> list = new ArrayList<>();



        for (int i = 0; i < n; i++) {
            list.add(br.readLine().split(""));
        }

        for (int i = 0; i < n; i++) {
            int counter = 0;
            int sum = 0;
            for (int j = 0; j < list.get(i).length; j++) {
                if (list.get(i)[j].equals("O")) {
                    counter++;
                    sum += counter;
                } else
                    counter = 0;

            }

            System.out.println(sum);
        }

    }

    }


