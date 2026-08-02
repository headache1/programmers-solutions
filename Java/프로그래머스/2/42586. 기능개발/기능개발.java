import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        List<Integer> result = new ArrayList<>();
        
        int count = 1;
        for (int i = 0; i < progresses.length; i++){
            while (progresses[i] + count * speeds[i] < 100){
                count+=1;
            }
            answer[i] = count;
            if (i >= 1 && answer[i] < answer[i-1]){
                answer[i] = answer[i-1];
            }
        }
        int place = 0;
        for (int i = 1; i < answer.length; i++){
            if (answer[i] != answer[i-1]){
                result.add(i-place);
                place = i;
            }
        }
        result.add(answer.length-place);
        int[] answer2 = result.stream().mapToInt(Integer::intValue).toArray();
        return answer2;
    }
}