import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int[][] bridge = new int[truck_weights.length][2];

        for (int i = 0; i < bridge.length; i++) {
            bridge[i] = new int[]{truck_weights[i], 0};
        }

        int place = 0;
        int len = 0;

        while (bridge[bridge.length - 1][1] != bridge_length) {

            int sum = 0;

            int end = Math.min(place + len, bridge.length - 1);

            for (int i = place; i <= end; i++) {
                bridge[i][1] += 1;
                sum += bridge[i][0];
            }
            answer += 1;

            if (place < bridge.length &&
                bridge[place][1] >= bridge_length) {

                sum -= bridge[place][0];
                place += 1;
                len -= 1;
            }

            if (place >= bridge.length) {
                continue;
            }

            int next = place + len+1;

            if (next < bridge.length &&
                sum + bridge[next][0] <= weight) {

                len += 1;
            }
        }

        return answer;
    }
}

/*
반환값 : 총 걸리는 시간

int 써도 무관

queue써야 함. 근데 뭐 arraydeque하고 하면 되니까

풀이예상1 : 
그냥 queue를 2개로 넣어서 


그냥 배열이 더 쉽지 않을까?

풀이예상2 :  
arrayList로 해서 숫자
*/