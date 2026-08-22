import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[]{numbers[0], 0});
        int i = 1;
        
        while(!pq.isEmpty()){
            int[] now = pq.peek();
            int num = now[0];
            int index = now[1];
            
            if (num < numbers[i]){
                answer[index] = numbers[i];
                pq.poll();
                pq.add(new int[]{numbers[i], i});
            }
            else if (num >= numbers[i]){
                pq.add(new int[]{numbers[i], i});
                i+=1;
            }
            
            
            
            
            if (i == numbers.length){
                while(!pq.isEmpty()){
                    int[] delete = pq.poll();
                    int ind = delete[1];
                    answer[ind] = -1;
                }
            }
            
        }
        return answer;
    }
}


/*
반환값 : 뒤에 있는 숫자 중 큰 숫자로 배열 다시 써보기

int 써도 됨

풀이예상 1 : 
a.priorityqueue로 이중배열 형태(실제 숫자, 위치)로 받는다.
b.peek하면서 크기 비교 


시간복잡도 예상 : O(n)

*/