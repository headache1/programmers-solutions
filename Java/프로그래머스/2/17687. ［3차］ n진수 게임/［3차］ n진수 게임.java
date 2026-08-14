import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String result = "";
        for (int i = 0; i < m*t; i++){
            answer+=Integer.toString(i,n);
        }
        for (int i = p-1; i < m*t; i=i+m){
            result+=answer.charAt(i);
        }
        return result.toUpperCase();
    }
}


/*
반환값 : 튜브는 무슨 순서대로 불러야 할까? 

이해 안됨 
1번 0 1 1 0 1 1 1 0 0 -> t가 4이므로 0 1 1 1
2번 0 1 2 3 4 5 6 ... 16은 1 0 1 1 .... -> 

string에다가 

예상 방식1 : 1. 그냥 모든 숫자를 toString(숫자,n)으로 변환해서 answer에다가 전부 이어 붙이기
2. for 반복문으로 p에서 시작 -> m만큼 더하는 걸로 t만큼 반복

예상 시간 복잡도 : n

예상 예외 : 생각나는 거 없음. 진행

*/
