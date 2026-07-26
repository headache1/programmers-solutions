class Solution {
    public int solution(int[][] triangle) {

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                // 맨 왼쪽은 왼쪽 위에서만 올 수 있음
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                }

                // 맨 오른쪽은 오른쪽 위에서만 올 수 있음
                else if (j == triangle[i].length - 1) {
                    triangle[i][j] += triangle[i - 1][j - 1];
                }

                // 가운데는 왼쪽 위와 오른쪽 위 중 큰 값 선택
                else {
                    triangle[i][j] += Math.max(
                        triangle[i - 1][j - 1],
                        triangle[i - 1][j]
                    );
                }
            }
        }

        int answer = 0;
        int last = triangle.length - 1;

        for (int i = 0; i < triangle[last].length; i++) {
            answer = Math.max(answer, triangle[last][i]);
        }

        return answer;
    }
}