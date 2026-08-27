import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] realtime = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++){
            String[] temp = book_time[i][0].split(":");
            String[] temp2 = book_time[i][1].split(":");
            realtime[i] = new int[]{Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]), 
                                    Integer.parseInt(temp2[0]) * 60 + Integer.parseInt(temp2[1])};
        }
        Arrays.sort(realtime, (a,b) ->{
            return Integer.compare(a[0], b[0]);
        });
        PriorityQueue <Integer> stack = new PriorityQueue<>();
        stack.offer(realtime[0][1] + 10);
        int max = 1;
        int count = 1;
        for (int i = 1; i < realtime.length; i++) {

            if (stack.peek() <= realtime[i][0]) {
                stack.poll();
            }

            stack.offer(realtime[i][1] + 10);

            max = Math.max(max, stack.size());
        }
        return max;
    }
}