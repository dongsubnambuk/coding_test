import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int init = 0;

        // 분해합 - N이 있을 때 N과 N을 이루는 각 자리수의 합을 의미
        // M의 분해합이 N인 경우 -> M을 N의 생성자
        // 245의 분해합은 256(245 + 2 + 4 + 5)이다.

        // 자연수 N을 입력받아서 N을 만들 수 있는 어떤 자연수 M을 찾으면 됨
        // 1부터 N까지 반복문 돌려서 본인과 원소들을 더하면서 찾아야함

        for (int i = 1; i <=N; i++) {
            // 1. 리스트에 현재 값, 쪼갠 값을 저장.
            // 2. 리스트 전체 합 구하기
            // 3. N과 같으면 루프 탈출
            list.clear();
            list.add(i);

            String Change = String.valueOf(i);
            String[] split = Change.split("");
            for (int j = 0; j < split.length; j++) {
                list.add(Integer.parseInt(split[j]));
            }

            int sum = 0;
            for (int j =0; j < list.size(); j++) {
                sum += list.get(j);
            }

            if (sum == N) {
                init = i;
                break;
            }

        }



        System.out.println(init);
    }
}
