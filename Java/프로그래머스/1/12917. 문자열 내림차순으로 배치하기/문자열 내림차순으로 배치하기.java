import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sort = new char[s.length()];
        for (int i = 0; i < sort.length; i++){
            sort[i] = s.charAt(i);
        }
        
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++){
            answer += sort[sort.length-1-i];
        }

        return answer;
    }
}