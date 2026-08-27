import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        for (int i = 0; i < weights.length-1; i++){
            if (weights[i] != 0){
                for (int j = i+1; j < weights.length;j++){
                    if (weights[j] == weights[i] || (double)weights[j] == (double)weights[i]/2*3 || weights[j] == weights[i]*2 ||
                        (double)weights[j] == (double)weights[i]/3*4){
                        answer++;    
                    }
                }
            }
        }
        return answer;
    }
}