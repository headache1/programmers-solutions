class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(m,n), icm(m,n)};
        
        return answer;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    int icm(int a, int b) {
        return a*b/gcd(a,b);
    }
}