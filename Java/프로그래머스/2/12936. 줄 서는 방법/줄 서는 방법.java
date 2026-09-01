import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        k--; // 0번째부터 시작하도록 변경

        for (int i = 0; i < n; i++) {
            factorial /= (n - i);

            int index = (int)(k / factorial);

            answer[i] = list.remove(index);

            k %= factorial;
        }

        return answer;
    }
}