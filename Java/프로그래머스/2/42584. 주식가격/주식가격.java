class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;
        for (int i = 0; i < prices.length-1; i++){
            answer[i] = prices.length-1-i;
            for (int j = 1; j + i < prices.length; j++){
                if (prices[i] > prices[i+j]){
                    answer[i] = j;
                    break;
                }
            }
        }
        return answer;
    }
}




/*
[주식가격 42584]

43232
11210
과거 풀이 여부: 없음
목표: 가격 하강 시간에 대한 리스트 반환

순서 / 중복 / 연속성: 순서, 연속성은 중요

최대 입력과 O(n²) 예상 연산량: O(n)

단순 풀이:

상태 / 자료구조: 큐

한 단계마다 바뀌는 것:
 
불변식:

종료 조건과 반환값:

시간 / 공간 복잡도:

확인할 예외:
가격이 끝까지 떨어지지 않음 / 바로 다음 초에 떨어짐 /
마지막 원소 / 같은 가격이 연속됨
*/