import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int people = sc.nextInt(); // 참가자 수

        int[] sizeArr = new int[6]; // 6가지 티셔츠 사이즈별 신청자 수
        for (int i = 0; i < sizeArr.length; i++) {
            sizeArr[i] = sc.nextInt();
        }

        int t = sc.nextInt(); // 티셔츠 주문단위 t장
        int p = sc.nextInt(); // 펜 주문단위 p자루

        // 결과를 저장할 변수들
        int tBundles = 0;	// 티셔츠 몇 묶음인가
        int pBundles = 0;	// 펜 몇 묶음인가
        int aPen = 0;		// 펜이 한자루씩 몇 개인가


        // Math.ceil() 소수점 첫째자리에서 올림
        for (int i : sizeArr) {
            tBundles += Math.ceil(i/(double)t);
//			System.out.println(Math.ceil(i/(double)t));
        }

        // 펜 - 사람 수에 딱 맞게
        // 몫과 나머지
        pBundles = people / p;
        aPen = people % p;


        System.out.println(tBundles);
        System.out.println(pBundles + " " + aPen);
    }
}
