import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        
        int max = 0;
        int max2 = 0;
        
        for (int i = 0; i < sizes.length; i++){
            if (max < sizes[i][0]){
                max = sizes[i][0];
            }
            if (max2 < sizes[i][1]){
                max2 = sizes[i][1];
            }
        }
        return max*max2;
    }
}