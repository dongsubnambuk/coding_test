class Solution {
    public int solution(int n) {
       boolean prime;
        int answer = 0;
        for(int i=2;i<=n;i++){ 
 
            prime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            
            if(prime==true){
                answer++;
            }
        }
 
        return answer;
    }
    
}