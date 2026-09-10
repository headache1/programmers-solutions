import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 0;
        int min = 100;
        for (int i = 0; i < wires.length; i++){
            HashSet<Integer> set1 = new HashSet<>();
            //HashSet<Integer> set2 = new HashSet<>();
            boolean[] visited = new boolean[wires.length];
            visited[i] = true;
            for (int k = 0; k <= n; k++){
                for (int j = 0; j < wires.length; j++){
                    if (!visited[j] && set1.isEmpty()){
                        set1.add(wires[j][0]);
                        set1.add(wires[j][1]);
                        //System.out.println("if" + j);
                        visited[j] = true;
                    }
                    else if (!visited[j] && (set1.contains(wires[j][0]) || set1.contains(wires[j][1]))){
                        set1.add(wires[j][1]);
                        set1.add(wires[j][0]);
                        //System.out.println("else if" + j);
                        visited[j] = true;
                    }
                }
            }
            if (min > Math.abs(set1.size() * 2 - n)){
                min = Math.abs(set1.size() * 2 - n);
            }
        }
        return min;
    }
}

/*
반환값 : 두 개의 연결 차이 절댓값

int 써도 됨
 
풀이예상1 : n은 99니까 이건 완전탐색이 맞다.
a. 


1 7 2 3 3 4 4 7 5 8
*/
