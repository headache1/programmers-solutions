

class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length;
        int[][] dp = new int[h][h];
        
        for (int i = 0; i < h ; i++){
            dp[h-1][i] = triangle[h-1][i];
        }
        
        for (int y = h-2 ; y >= 0; y--){
            for (int x = 0; x <=y; x++){
                int left = dp[y+1][x];
                int right = dp[y+1][x+1];
                
                dp[y][x] = triangle[y][x] + Math.max(left, right);
            }
        }
        return dp[0][0];
    }
}


/*
[정수 삼각형 43105 / D1]

목표: 최대 크기

최대 입력과 예상 복잡도: 그냥 이중배열 내에 있는 모든 원소의 개수

dp 상태: 

초기값(base): 맨 밑줄만 살려두기

점화식(transition): 높이가 위에 있는 것은, 자기랑 맞닿은 2개 중 큰 것과의 합이다.

계산 순서(order): 

불변식: 

종료 조건과 반환값(answer): height = 0까지 계산

시간 / 공간 복잡도: O(nlogn)

확인할 예외:
높이 1 / 양쪽 결과가 같은 경우 /
최적 경로가 가장자리에 있는 경우
*/