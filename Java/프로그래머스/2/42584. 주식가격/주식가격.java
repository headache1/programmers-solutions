import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque <Integer> stack = new ArrayDeque<>();
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++){
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int previous = stack.pop();
                answer[previous] = i - previous;
            }
            stack.push(i);

        }
        for (int i = 0; i < answer.length; i++){
            if (answer[i] == 0){
                answer[i] = answer.length-i-1;
            }
        }
        return answer;
    }
}

/*

43213
11110

문제: 주식가격 (42584)
모드: 재현 진단
시작 시각: 11:50
과거 접촉: 없음
힌트: H0

answer[i]의 의미: 가격이 떨어지기까지 걸린 시간
________________________________

단순 풀이:
________________________________

prices.length 최대치: 100,000
________________________________

단순 풀이의 최악 연산량: 100,000^2
________________________________

답이 확정되는 순간: 
________________________________

후보 자료구조와 이유:
________________________________
*/