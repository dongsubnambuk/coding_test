class Solution {
    public int solution(int n, int m, int[] section) {
       int answer = 1;
        //n - 페인트가 칠해진 길이, 1미터의 구역을 n개로 나눔, 1번부터 n번까지 번호 붙임
        //m - 페인트를 칠하는 룰러의 길이, 벽을 벗어나면 안됨, 일부만 칠해져도 안됨. 연속된 구역만 칠할 수 있음.
        // section[] - 다시 페인트를 칠하기로 정한 구역들의 번호

        // 초기값 지정
         int st = section[0];
        // 람다 for문: 배열의 인덱스 번호를 가져오는것이 아닌 해당 배열의 값을 i로 받아옴
           for(int i : section) {
               //0번째 값에 m-1한 만큼 더함. 2+3 =5, 이거를5<2 일때 초기값 i값을 저장. -> 이것을 반복
            if(st + (m-1)<i){
               st =i;
               answer++;
           }
        }

        return  answer;
    }
}