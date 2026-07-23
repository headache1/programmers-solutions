import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];

        for (int i = 0; i < answer.length; i++) {
            int temp = 0;

            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                temp += 1;
            }

            answer[i] = temp;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int point = 0;

        for (int i = 1; i < answer.length; i++) {
            if (answer[i] <= answer[i - list.get(point)]) {
                list.set(point, list.get(point) + 1);
            } else {
                point += 1;
                list.add(1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}