import java.util.*;

class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        int[] temp = new int[4];

        for (int i = 0; i < balls.length; i++) {

            // 오른쪽 벽
            if (!(startY == balls[i][1] && balls[i][0] > startX)) {
                int case1 = (int)(
                    Math.pow(startX - ((2 * m) - balls[i][0]), 2)
                    + Math.pow(startY - balls[i][1], 2)
                );
                temp[0] = case1;
            } else {
                temp[0] = 4000000;
            }

            // 왼쪽 벽
            if (!(startY == balls[i][1] && balls[i][0] < startX)) {
                int case2 = (int)(
                    Math.pow(startX + balls[i][0], 2)
                    + Math.pow(startY - balls[i][1], 2)
                );
                temp[1] = case2;
            } else {
                temp[1] = 4000000;
            }

            // 위쪽 벽
            if (!(startX == balls[i][0] && balls[i][1] > startY)) {
                int case3 = (int)(
                    Math.pow(startY - ((2 * n) - balls[i][1]), 2)
                    + Math.pow(startX - balls[i][0], 2)
                );
                temp[2] = case3;
            } else {
                temp[2] = 4000000;
            }

            // 아래쪽 벽
            if (!(startX == balls[i][0] && balls[i][1] < startY)) {
                int case4 = (int)(
                    Math.pow(startY + balls[i][1], 2)
                    + Math.pow(startX - balls[i][0], 2)
                );
                temp[3] = case4;
            } else {
                temp[3] = 4000000;
            }

            Arrays.sort(temp);
            answer[i] = temp[0];
        }

        return answer;
    }
}

/*

반환값 : 최소길이의 배열

궁금증

3,7 -> 13,3 거리는 100+16 = 116
3,7 -> 7,-3
3,7 랑 1,6이면? -1,6이랑 1,14
16+1 / 4

7-> 13 이면 
k -> 2(10-k)+k = 20-k
int 써도 됨

푸는 방식 : 그냥 4개 케이스를 전부 다루고 max를 찾자.

시간복잡도 : n
*/