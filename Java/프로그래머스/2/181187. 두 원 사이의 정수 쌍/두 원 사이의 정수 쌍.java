class Solution {
    public long solution(int r1, int r2) {
        long answer = count(r2) - count(r1) + check(r1);
        System.out.println(check(r1));
        return answer;
    }
    public long count(int r){
        long answer = 0;
        long r1 = r;
        for (long i = 0; i <=r1 ; i++){
            long temp = (int)Math.sqrt(r1 * r1 - i * i);
            answer += temp + 1;
        }
        return answer * 4 - r* 4 - 3;
    }
    public long check(int r){
        long answer = 0;
        long r1 = r;
        for (long i = 0; i <=r1 ; i++){
            double temp = Math.sqrt(r1 * r1 - i * i);
            if ((int) temp == temp){
                answer+= 1;
            }
        }
        return answer * 4 - 4;
    }
}