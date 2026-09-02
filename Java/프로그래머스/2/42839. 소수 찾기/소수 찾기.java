import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        String temp = "0";
        HashSet <Integer> set = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers,set,visited, temp);
        for (int x : set){
            int check = 0;
            for (int i = 2; i * i <= x; i++){
                if (x % i == 0){
                    check = 1;
                    break;
                }
            }
            if (check == 0 && x >= 2){
                answer++;
            }
        }
        System.out.println(set);
        return answer;
    }
    public void dfs(String numbers, HashSet<Integer> set, boolean[] visited, String temp){
         
        for (int i = 0; i < numbers.length(); i++){
            if (!visited[i]){
                visited[i] = true;
                temp += numbers.charAt(i);
                set.add(Integer.parseInt(temp));
                
                dfs(numbers, set, visited, temp);
                
                visited[i] = false;
                temp = temp.substring(0,temp.length()-1);
            }
        }
    }
}