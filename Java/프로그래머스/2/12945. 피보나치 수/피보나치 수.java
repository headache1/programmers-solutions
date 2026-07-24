class Solution {
    public int solution(int n) {
        int answer = 0;
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        for(int i = 0; i <= n; i++){
            if (i == 0){
                answer = f0;
            }
            if (i == 1){
                answer = f1;
            }
            if ( i >= 2){
                f2 = (f0+f1) % 1234567;
                answer = f2;
                f0=f1;
                f1=f2;
            }
        }
        return answer;
    }
}