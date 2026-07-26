import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int place = score.length-m;
        while (place >= 0){
            answer += score[place] * m;
            place -= m;
        }
        return answer;
    }
}