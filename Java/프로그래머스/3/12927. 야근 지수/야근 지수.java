import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue <Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < works.length; i++){
            queue.add(works[i]);
        }
        for (int i = 0; i < n; i++){
            int x = queue.poll()-1;
            if (x < 0){
                x = 0;
            }
            queue.add(x);
        }
        for (int i = 0; i < works.length; i++){
            answer += Math.pow(queue.poll(),2);
        }
        return answer;
    }
}

/*
반환값 : 리스트 각 원소 제곱들의 합

long 사용해야 함

예상 사용 자료 구조1 : 배열

예상 시간 복잡도1 : n

풀기 예상도 1: 1. 전부 합한다. 2.n을 뺀다. 3.

예외? : 7 2 2 / 2 면 5 2 2 로 되어야 하는데 333이 됨. 1번 방식 안됨

풀기 예상도 2 : 1. 배열을 sort한다. 2.뒤에서부터 -1을 한다. 그 이후 sort 무한 반복

예상 시간 복잡도 : n^2logn

풀기 예상도 3 : 1. priorityqueue로 받는다. 2.poll로 가장 큰 거 빼내고 -1한 걸 다시 넣는다. 무한 반복

예상 시간 복잡도 : logn (1차 최종 확정 방식)

*/