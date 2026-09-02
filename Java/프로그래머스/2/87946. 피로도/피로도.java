import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visited = new boolean[dungeons.length];
        PriorityQueue <Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        
        dfs(dungeons, k, 0, visited, 0, list);
        return list.peek();
    }
    public void dfs(int[][] dungeons, int k, int depth, boolean[] visited, int num, PriorityQueue<Integer> list){
        //int answer = 0;
        if (depth == dungeons.length){
           list.add(num); 
        }
        for (int i = 0; i < dungeons.length; i++){
            if (!visited[i]){
                visited[i] = true;
                if (k >= dungeons[i][0]){
                    dfs(dungeons, k-dungeons[i][1], depth+1, visited, num+1, list);
                }
                else if (k < dungeons[i][0]){
                    dfs(dungeons, k, depth+1, visited, num, list);
                }
                
                visited[i] = false;
            }
        }
        //System.out.println(num);
        //return answer;
    }
}

/*
반환값 : 던전 통과 개수

int 써도 됨

풀이방법 : 
80 70 / 50 10 / 30 10

그냥 완전탐색하자

*/