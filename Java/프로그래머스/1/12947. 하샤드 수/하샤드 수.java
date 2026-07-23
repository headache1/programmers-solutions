class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int hash = x%10 + (x%100/10) + (x%1000/100) + (x%10000/1000) + (x%100000/10000);
        if (x%hash == 0){
            answer = true;
        }
        return answer;
    }
}