import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int n = maps.length;
        int m = maps[0].length;
        
        int answer = 0;

        boolean[][] visited = new boolean[n][m];

        ArrayDeque<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            int x = now[0];
            int y = now[1];
            int distance = now[2];
            
            if (x == n-1 && y == m-1){
                return distance;
            }

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && nx < n
                        && ny >= 0 && ny < m
                        && maps[nx][ny] == 1
                        && !visited[nx][ny]) {

                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, distance + 1});
                }
            }
        }

        return -1;
    }
}