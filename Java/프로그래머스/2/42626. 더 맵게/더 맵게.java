import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Long> queue = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++){
            queue.add((long)scoville[i]);
        }
        while (queue.peek() < K){
            if (queue.size() < 2){
                return -1;
            }
            long small = queue.poll();
            long big = queue.poll();
            long temp = small + big * 2;
            queue.add(temp);
            answer += 1;
        }
        return answer;
    }
}