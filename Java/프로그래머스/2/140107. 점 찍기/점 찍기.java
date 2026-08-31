import java.util.*;

class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        for (int i = 0; i <= d; i+=k){
            int temp = (int)Math.sqrt((long)d*(long)d - (long)i*(long)i);
            answer += temp / k + 1;
        }
        return answer;
    }
}