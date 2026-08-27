import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] count = new int[players.length];
        for (int i = 0; i < players.length; i++){
            if ((players[i]/m) <= count[i]){
                continue;
            } 
            if ((players[i]/m) > count[i]){
                int what = (players[i]/m)-count[i];
                answer+= what;
                for (int j = i; j < i+k; j++){
                    if (j < count.length){
                        count[j] += what;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(count));
        return answer;
    }
}