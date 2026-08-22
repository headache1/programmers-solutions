import java.util.*;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        //a
        HashMap<String, Integer> dic = new HashMap<>();
        int i = 1;
        for (char x = 'A'; x <= 'Z'; x++) {
            dic.put(String.valueOf(x), i);
            i++;
        }
        
        //b
        for (int j = 0; j < msg.length(); j++){
            //c
            String temp = "";
            temp += msg.charAt(j);
            int temp_num = j;
            int temp_put = dic.get(temp);
            while (dic.containsKey(temp) && temp_num < msg.length()-1){
                temp_put = dic.get(temp);
                temp_num++;
                temp +=msg.charAt(temp_num);
            }
            if (dic.containsKey(temp)) {
            // 문자열 끝까지 사전에 존재하는 단어인 경우
            temp_put = dic.get(temp);
            j += temp.length() - 1;
        } else {
            // 마지막 한 글자를 붙였더니 사전에 없는 경우
            j += temp.length() - 2;
            dic.put(temp, i);
            i++;
}

answer.add(temp_put);
        }
        
        int[] result = new int[answer.size()];
        for(int j = 0; j < answer.size(); j++){
            result[j] = answer.get(j);
        }
        return result;
    }
}

/*

반환값 : 사전 색인 번호의 배열

int 써도 무방

예상풀이1 :
a. 일단 A부터 Z까지 hashmap으로 넣어
b. while 문으로 string 끝까지 돌 때까지, 
c. 이중 while 문으로 그 안에서 문자를 계속 이어붙인 것이 hashmap에 없을 때까지 
d.answer에 넣기

시간복잡도 : n

*/