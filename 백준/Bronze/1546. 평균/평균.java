import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // M : 자기 점수 중 최댓값
        // 모든 과목 점수 -> 과목 점수/M *100으로 환산
        // 새로운 점수의 평균을 계산
        List<Double> score = new ArrayList<>();
        List<Double> resultScore = new ArrayList<>();

        int M =0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            score.add((double) sc.nextInt());
        }

        for (int i = 0; i < N; i++) {
            M = (int) Math.max(score.get(i), M);
        }


        for (int i = 0; i < N; i++) {
            resultScore.add((double) (score.get(i)/M*100));
        }

        double avg = resultScore.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(avg);




    }
}
