class Solution {
    public int[] solution(int n, long left, long right) {
        int[] first = new int[n];

        for (int i = 0; i < n; i++) {
            first[i] = i + 1;
        }

        int[] answer = new int[(int)(right - left + 1)];
        int index = 0;

        for (; left <= right; left++) {
            long k = left / n + 1;

            if (first[(int)(left % n)] < k) {
                answer[index] = (int)k;
            } else {
                answer[index] = first[(int)(left % n)];
            }

            index += 1;
        }

        return answer;
    }
}