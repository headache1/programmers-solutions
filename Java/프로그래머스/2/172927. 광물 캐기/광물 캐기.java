import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int amount = 0;
        int max_count = 0;
        for (int i = 0; i < 3; i++){
            max_count += picks[i] * 5;
        }
        if (minerals.length % 5 == 0){
            amount = minerals.length/5;
        }
        else{
            amount = minerals.length/5 + 1;
        }
        int[][] tired = new int[amount][3];
        int count = 1;
        int[] sum = new int[3];
        int dia_temp = 0;
        int iron_temp = 0;
        int stone_temp = 0;
        int limit = Math.min(minerals.length, max_count);
        for (int i = 0; i < limit; i++){
            if (minerals[i].equals("diamond")){
                stone_temp = 25;
                iron_temp = 5;
                dia_temp = 1;
            }
            if (minerals[i].equals("iron")){
                stone_temp = 5;
                iron_temp = 1;
                dia_temp = 1;
            }
            if (minerals[i].equals("stone")){
                stone_temp = 1;
                iron_temp = 1;
                dia_temp = 1;
            }
            
            sum[0] += dia_temp;
            sum[1] += iron_temp;
            sum[2] += stone_temp;
            
            if (count % 5 == 0 ||i == limit-1){
                tired[i/5] = sum;
                sum = new int[]{0,0,0};
            }
            
            count++;
            
        }
        
        Arrays.sort(tired, (a,b) -> {
            if (a[1] != b[1]){
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(b[2],a[2]);
        });
        
        for (int i = 0; i < tired.length; i++){
            if (picks[0] > 0){
                answer += tired[i][0];
                picks[0]--;
            }
            else if (picks[1] > 0){
                answer += tired[i][1];
                picks[1]--;
            }
            else if (picks[2] > 0){
                answer += tired[i][2];
                picks[2]--;
            }
        }
        return answer;
    }
}