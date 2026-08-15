import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap <Integer, Integer> map = new TreeMap<>();
        for (String x : operations){
            switch (x) {
                case "D -1": 
                    if (map.isEmpty()){
                        break;
                    }
                    int small = map.firstKey();
                    map.put(small, map.getOrDefault(small,0)-1);
                    if (map.get(small) == 0){
                        map.remove(small);
                    }
                    break;
                case "D 1":
                    if (map.isEmpty()){
                        break;
                    }
                    int big = map.lastKey();
                    map.put(big, map.getOrDefault(big,0)-1);
                    if (map.get(big) == 0){
                        map.remove(big);
                    }
                    break;
                default :
                    String num = "";
                    for (int i = 2; i < x.length(); i++){
                        num += x.charAt(i);
                    }
                    int n = Integer.parseInt(num);
                    map.put(n, map.getOrDefault(n,0)+1);
            }
        }
        if (!map.isEmpty()){
            int[] answer = {map.lastKey(), map.firstKey()};
            return answer;
        }
        else {
            int[] answer = {0,0};
            return answer;
        }
    }
}

/*
반환값 : 최종적인 배열은 무엇인가? 

int 써도 됨

자료 구조 : treemap? priorityqueue? arraylist?

풀이 예상 1 : switch 쓰면 되지 않을까? 그냥 순서대로 받아보자. 일단 제일 만만한 arraylist로 

예상 시간 복잡도 : n^2logn <- 너무 큰데

treemap으로 써보자

예상 시간 복잡도 : n
*/