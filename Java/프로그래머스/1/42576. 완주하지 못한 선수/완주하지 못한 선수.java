import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map <String, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < participant.length; i++){
            hashmap.put(participant[i],hashmap.getOrDefault(participant[i],0)+1);
            if (i != participant.length -1){
                hashmap.put(completion[i], hashmap.getOrDefault(completion[i],0)-1);
            }
        }
        
        return hashmap.keySet().stream().filter(key -> hashmap.get(key) != 0).findFirst().get();
    }
}

/*
목표: 완주하지 못한 학생 이름 1명 string
순서 / 중복 / 연속성: 순서 상관 없음. 중복 상관 있음(동명이인) , 연속성 상관 없음
최대 입력과 예상 복잡도: O(2n-1) 다시 말해 O(n) 여기서 n은 participant.length
상태 / 자료구조: hashmap
한 단계마다 바뀌는 것: hashmap 갱신
불변식: 딱히 없는 듯?
종료 조건: completion에 있는 걸 전부 제외해서 hashmap에 1을 부여받은 key가 1개
시간 / 공간 복잡도: O(n) / 0(n)  n은 participant.length
예외: 그딴 거 없음 */