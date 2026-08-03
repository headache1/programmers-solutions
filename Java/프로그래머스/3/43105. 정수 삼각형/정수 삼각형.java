import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length;
        int[][] dp = new int[h][h];

        for (int x = 0; x < h; x++) {
            dp[h - 1][x] = triangle[h - 1][x];
        }
        
        for (int y = h-2; y >= 0; y--){
            for (int x = 0; x <= y; x++){
                int left = dp[y+1][x];
                int right = dp[y+1][x+1];
                
                dp[y][x] = triangle[y][x] + Math.max(left, right);
            }
        }

        return dp[0][0];
    }
}