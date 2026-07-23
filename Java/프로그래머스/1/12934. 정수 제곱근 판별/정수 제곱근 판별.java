import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        if (Math.sqrt(n) - (long) Math.sqrt(n) > 0){
            return -1;
        }
        else{
            answer = ((long) Math.sqrt(n)+1) * ((long) Math.sqrt(n)+1);
        }
        return answer;
    }
}