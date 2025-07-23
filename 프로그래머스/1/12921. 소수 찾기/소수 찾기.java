class Solution {
    public int solution(int n) {
       int count = 1;
        
         for (int i = 3; i <= n; i++) {
            if (isPrime(i)){
                count++;
            }
         }
        return count;
    }
    
      public boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {		// 2보다 크고 n보다 작은 수로 나눈다.
            if (n % i == 0) return false;		// 만약 나누어 떨어지는 것이 있다면 false 반환
        }
        return true;				// 모두 나누고도 떨어지는 수가 없다면 true 반환
    }
}