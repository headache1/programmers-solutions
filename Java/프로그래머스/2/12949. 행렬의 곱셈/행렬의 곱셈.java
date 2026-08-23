class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1_row = arr1.length; //3
        int same = arr2.length; //2
        int arr2_col = arr2[0].length;//2
        int[][] answer = new int[arr1_row][arr2_col];
        
        for (int m = 0; m < arr1_row; m++){
            for (int n = 0; n < arr2_col; n++){
                int temp = 0;
                for (int i = 0; i < same; i++){
                    temp += arr1[m][i] * arr2[i][n];
                }
                answer[m][n] = temp;
            }
        }
        return answer;
    }
}


/*
반환값 : 행렬의 곱셈

int 써도 됨

arr1은 안에 루프, arr2는 밖에 루프

00 01 02 
00 10 20 01 11 12 20 21 22   
*/