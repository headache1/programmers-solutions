import java.util.*;

class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[n];
        answer = dfs(n, q, ans, 0, visited, list, 1);
        return answer;
    }
    
    public int dfs(int n, int[][] q, int[] ans, int depth, boolean[] visited, ArrayList<Integer> list, int start){
        int answer = 0;
        if (depth == 5){
            int check = 0;
            for (int i = 0; i < q.length; i++){
                int count = 0;
                for (int j = 0; j < 5; j++){
                    if (list.contains(q[i][j])){
                        count++;
                    }
                }
                if (count != ans[i]){
                    check = 1;
                    break;
                }
            }
            if (check == 0){
                return 1;
            }
        }
        for (int i = start; i<=n; i++){
            if (!visited[i-1]){
                visited[i-1] = true;
                list.add(i);
                start = i+1;
                if (depth < 5){
                    answer += dfs(n, q, ans, depth+1, visited, list, start);
                }                
                visited[i-1] = false;
                list.remove(Integer.valueOf(i));
            }
        }
        return answer;
    }
}