public class Solution {

    public long solution(int[][] land, int P, int Q) {
        long left = Long.MAX_VALUE;
        long right = Long.MIN_VALUE;

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                left = Math.min(left, land[i][j]);
                right = Math.max(right, land[i][j]);
            }
        }

        while (left < right) {
            long mid = (left + right) / 2;

            long cost1 = getCost(land, P, Q, mid);
            long cost2 = getCost(land, P, Q, mid + 1);

            if (cost1 <= cost2) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return getCost(land, P, Q, left);
    }

    private long getCost(int[][] land, int P, int Q, long height) {
        long cost = 0;

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {

                if (land[i][j] < height) {
                    cost += (height - land[i][j]) * P;
                } else if (land[i][j] > height) {
                    cost += (land[i][j] - height) * Q;
                }
            }
        }

        return cost;
    }
}