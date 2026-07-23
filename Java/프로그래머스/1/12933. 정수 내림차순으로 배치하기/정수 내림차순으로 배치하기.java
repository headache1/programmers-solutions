import java.util.*;

class Solution {
    public long solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        for (int i = 0; i <answer.length; i++){
            answer[i] = (int) (n%10);
            n /= 10;
        }
        
        Arrays.sort(answer);
        String result = "";
        for (int i = answer.length-1; i >=0; i--){
            result += answer[i];
        }
        return Long.parseLong(result);
    }
}