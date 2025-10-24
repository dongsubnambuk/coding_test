import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int C = sc.nextInt();
            int speed = 0;
            int distance = 0;

            for (int i = 0; i < C; i++) {
                int command = sc.nextInt();

                switch (command) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        int acc = sc.nextInt();
                        speed += acc;
                        break;
                    }
                    case 2: {
                        int dec = sc.nextInt();
                        speed -= dec;
                        if (speed < 0) speed = 0;
                        break;
                    }
                    default: {
                        break;
                    }
                }

                distance += speed;
            }

            System.out.println("#" + t + " " + distance);
        }

        sc.close();
    }
}