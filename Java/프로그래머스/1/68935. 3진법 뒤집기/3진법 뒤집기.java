import java.util.*;

class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n,3);
        int answer = 0;
        for (int i = 0; i < ternary.length(); i++){
            answer += Long.parseLong(String.valueOf(ternary.charAt(i))) * Math.pow(3,i); 
        }
        return answer;
    }
}