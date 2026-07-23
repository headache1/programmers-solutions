import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        String temp = "";
        long temp_int = 0;
        while (!s.equals("1")){
            temp = "";
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '1'){
                    temp += s.charAt(i);
                }
                else {
                    answer[1] += 1;
                }
            }
            temp_int = temp.length();
            String binary = Long.toBinaryString(temp_int);
            s = String.valueOf(binary);
            answer[0] += 1;
        }
        return answer;
    }
}