import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char now = number.charAt(i);

            while (k > 0 && answer.length() > 0 && answer.charAt(answer.length()-1) < now) {
                answer.deleteCharAt(answer.length() - 1);
                k--;
            }

            answer.append(now);
        }
        
        while (k > 0) {
            answer.deleteCharAt(answer.length() - 1);
            k--;
        }
        return answer.toString();
    }
}


