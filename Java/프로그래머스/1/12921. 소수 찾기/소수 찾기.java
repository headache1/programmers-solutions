class Solution {
    public int solution(int n) {
        int answer = 0;
        int target = 1000000;
        boolean[] notprime = new boolean[target+1];
        
        for (int i = 2; i*i <= target; i++){
            if (notprime[i]){
                continue;
            }
            for (int j = i*i ; j <= target; j+=i){
                if (notprime[j]){
                    continue;
                }
                if (j % i == 0){
                    notprime[j] = true;
                }
            }
        }
        
        for (int i = 2; i <=n; i++){
            if (!notprime[i]){
                answer+=1;
            }
        }
        return answer;
    }
}