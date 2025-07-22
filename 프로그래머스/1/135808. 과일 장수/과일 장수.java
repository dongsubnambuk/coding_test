import java.util.*;


public class Solution {
    public int solution(int k, int m, int[] score) {

        // 사과상태 1점부터 k점까지 분류
        // k가 최고(MAX), 1점이(min)
        // 한상자 가격 = 사과를 m개를 담음, 담긴 사과중 가장 작은값 * m
        // socre[] = 사과들의 점수
        //최대 이익 = 최저 사과 점수 * 상자에 담긴 사과 개수 * 상자의 개수

       int count = 0;
        // 내림차순 정렬
        Arrays.sort(score);
        int n = score.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = score[i];
            score[i] = score[n - 1 - i];
            score[n - 1 - i] = temp;
        }
        int sum = 0;
        int min =10;
        for (int i = 0; i < score.length; i++) {
            count++;
            if(min>score[i]){
                min = score[i];
            }

            if (count == m) {
                count = 0;
                sum += min *m;
            }

        }
        return sum;
    }
}