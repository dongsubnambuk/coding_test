import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> CardNum = new ArrayList<>();

        // 카드의 합이 21을 넘지 않아야하고 카드의 합을 최대한 크게 만드는 게임
        // N장의 카드를 공개 -> 숫자 M을 외침
        // N장의 카드 중 3장을 고름 -> 고른 카드 합은 M을 넘기면 안되고 M과 최대한 가깝게 만들어야함

        // 입력 첫 줄 : 카드 개수(N), M
        // 입력 두번째 줄: 카드 숫자

        // 출력: M을 넘지않으면서 가깝게 만들어야함 같아도 됨

        for (int i = 0; i < N; i++) {
            CardNum.add(sc.nextInt());
        }
        int tmp =0;

        for(int i =0; i<N-2; i++){
            for(int j =i+1; j<N-1; j++){
                for(int k =j+1; k<N; k++){
                    int sum = CardNum.get(i) + CardNum.get(j) + CardNum.get(k);
                    if(sum<=M){
                        tmp = Math.max(tmp,sum);
                    }
                }

            }
        }

        System.out.println(tmp);
    }
}
