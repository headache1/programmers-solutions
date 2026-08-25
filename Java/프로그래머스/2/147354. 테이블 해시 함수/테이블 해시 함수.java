import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, (a,b) -> {
            if (a[col-1] != b[col-1]){
                return Integer.compare(a[col-1],b[col-1]);
            }
            
            return Integer.compare(b[0], a[0]);
        });
        int[] answer_list = new int[row_end-row_begin+1];
        int place = 0;
        for (int i = row_begin; i <= row_end; i++){
            int divide = i;
            int sum = 0;
            for (int j = 0; j < data[i-1].length; j++){
                sum += data[i-1][j] % divide;
            }
            answer_list[place] = sum;
            place++;
        }
        for (int i = 0; i < answer_list.length; i++){
            answer = answer ^ answer_list[i];
        }
        return answer;
    }
}