class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n>=a){
            int left = n - (n/a)*a;
            answer += (n/a)*b;
            n = left + (n/a)*b; 
        }
        return answer;
    }
}