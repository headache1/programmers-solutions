import java.util.*;

class Solution {
    public int solution(int n, String[] data) {
        int answer = 0;
        String[] member = new String[]{"A", "C", "F", "J", "M", "N", "R", "T"};
        boolean[] visited = new boolean[8];
        ArrayList<String> list = new ArrayList<>();
        answer = dfs(data,member, 0, visited, list);
        return answer;
    }
    
    public int dfs(String[] data, String[] member, int depth, boolean[] visited, ArrayList<String> list){
        int num = 0;
        if (depth == member.length){
            int check = 0;
            for (int i = 0; i < data.length; i++){
                char first = data[i].charAt(0);
                char third = data[i].charAt(2);
                char fourth = data[i].charAt(3);
                char fifth = data[i].charAt(4);
                
                int distance = Math.abs(list.indexOf(Character.toString(first) )
                    - list.indexOf(Character.toString(third)));
                distance--;
                if (fourth == '='){
                    if (distance != fifth-'0'){
                        check = 1;
                        break;
                    }
                }
                else if (fourth == '<'){
                    if (distance >= fifth-'0'){
                        check = 1;
                        break;
                    }
                }
                else if (fourth == '>'){
                    if (distance<=fifth-'0'){
                        check = 1;
                        break;
                    }
                }
                
            }
            if (check == 0){
                return 1;
            }
        }
        for (int i = 0; i < member.length; i++){
            if (!visited[i]){
                visited[i] = true;
                list.add(member[i]);
            
            
                num += dfs(data, member, depth+1, visited, list);
            
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
        
        return num;
    }
}

/*
반환값 : 경우의 수

int 써도 무방

풀이예상 1 :
a. 기본적으로 완전탐색(bfs) 문제
b. data 전체를 순회하면서 해당 조건이 '아닐시' 패스

*/