import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        int leng = 0;
        for (int i = 0; i < record.length; i++){
            String[] temp = record[i].split(" ");
            if (!temp[0].equals("Change")){
                leng++;
            }
        }
        String[] answer = new String[leng];
        HashMap <String, String> map = new HashMap<>();
        
        int place = 0;
        for (int i = 0; i < record.length; i++){
            String[] temp = record[i].split(" ");
            if (temp[0].equals("Enter")){
                map.put(temp[1], temp[2]);
                answer[place] = temp[1]+"들";
                place++;
            }
            if (temp[0].equals("Change")){
                map.put(temp[1],temp[2]);
            }
            if (temp[0].equals("Leave")){
                answer[place] = temp[1]+"나";
                place++;
            }
        }
        for (int i = 0; i < answer.length; i++){
            String name = map.get(answer[i].substring(0,answer[i].length()-1));
            if (answer[i].substring(answer[i].length()-1, answer[i].length()).equals("들")){
                answer[i] = name+"님이 들어왔습니다.";
            }
            else{
                answer[i] = name+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}