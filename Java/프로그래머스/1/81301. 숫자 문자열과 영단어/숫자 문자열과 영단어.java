import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, Character> map = Map.of(
            "zero", '0',
            "one", '1',
            "two", '2',
            "three", '3',
            "four", '4',
            "five", '5',
            "six", '6',
            "seven", '7',
            "eight", '8',
            "nine", '9'
        );
        String answer = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++){
            char t = s.charAt(i);
            if (t >= '0' && t<= '9'){
                answer += t;
            }
            else{
                temp+=t;
                if (map.containsKey(temp)){
                    answer += map.get(temp);
                    temp = "";
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
}