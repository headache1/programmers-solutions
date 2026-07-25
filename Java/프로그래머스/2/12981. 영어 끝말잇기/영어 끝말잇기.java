import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap <String, Integer> map = new HashMap<>();
         map.put(words[0], map.getOrDefault(words[0],0)+1);
        for(int i = 1; i < words.length; i++){
            map.put(words[i], map.getOrDefault(words[i],0)+1);
            if (map.get(words[i]) > 1 || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i+1) % n;
                if (answer[0] == 0){
                    answer[0] = n;
                }
                answer[1] = (int) Math.ceil( (float) (i+1) / n);
                break;
            }
        }

        return answer;
    }
}