import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        ArrayDeque <Integer> queue_1 = new ArrayDeque<>();
        ArrayDeque <Integer> queue_2 = new ArrayDeque<>();
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < queue1.length; i++){
            queue_1.offer(queue1[i]);
            sum1 += queue1[i];
            queue_2.offer(queue2[i]);
            sum2 += queue2[i];
        }
        long total = sum1+sum2;
        
        while (sum1 != sum2){
            if (sum1 < sum2){
                int temp = queue_2.poll();
                queue_1.offer(temp);
                sum2-=temp;
                sum1+=temp;
                answer++;
            }
            else if (sum1 > sum2){
                int temp = queue_1.poll();
                queue_2.offer(temp);
                sum1-=temp;
                sum2+=temp;
                answer++;
            }
            if (answer > (queue1.length + queue2.length) * 3){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}