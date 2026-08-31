class Solution {
    public long solution(int w, int h) {
        long answer = (long)w * h - (w + h - gcd(w,h));
        return answer;
    }
    public int gcd(int a, int b){
        while (b!= 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}