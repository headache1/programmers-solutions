import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++){
            int[] answer = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < answer.length; j++){
                answer[j] = array[j+commands[i][0]-1];
            }
            Arrays.sort(answer);
            result[i] = answer[commands[i][2] - 1];
        }
        return result;
    }
}