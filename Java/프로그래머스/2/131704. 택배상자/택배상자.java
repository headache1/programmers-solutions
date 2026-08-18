import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        int place = 1;
        for (int i = 0; i < order.length; i++){
            if (order[i] >= place){
                for (int j = place; j < order[i]; j++){
                    stack.push(j);
                }
                //stack에 다 넣고 그 다음 트럭에 진짜
                answer +=1;
                place = order[i]+1;
            }
            else if (order[i] < place){
                if (stack.peek() == order[i]){
                    stack.pop();
                    answer+=1;
                }
                else{
                    return answer;
                }
            }
        }
        return answer;
    }
}

/*
반환값 : 최대 몇개의 상자를 써야 하나요?
int 써도 됨
순서 중요

풀이 예상 1 :
1.가장 첫번째 상자 순서때까지 stack에 넣는다
2.다음으로 첫번째 상자보다 클 시 계속 stack에 넣고, 만일 작을시 stack 맨 위를 찾는다.
3. 둘 다 안되면 끝낸다.

문제점 : 뭔지는 모르겠는데 안되는 케이스들 존재


*/