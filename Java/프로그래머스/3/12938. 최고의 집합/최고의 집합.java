class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if (s < n){
            int[] error = new int[]{-1};
            return error;
        }
        else{
            if (s%n == 0){
                for(int i = 0; i < n; i++){
                    answer[i] = s/n;
                }
            }
            else{
                int count = s%n;
                for (int i = 0; i < n-count; i++){
                    answer[i] = s/n;
                }
                for (int i = n-count; i < n; i++){
                    answer[i] = s/n+1;
                }
            }
        }
        return answer;
    }
}