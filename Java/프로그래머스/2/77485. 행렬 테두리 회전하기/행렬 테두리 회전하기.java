class Solution { 
    public int[] solution(int rows, int columns, int[][] queries) { 
        int[][] answer = new int[rows][columns]; 
        int num = 1; 

        for (int i = 0; i < rows; i++){ 
            for (int j = 0; j < columns; j++){ 
                answer[i][j] = num++; 
            } 
        } 

        int[] result = new int[queries.length]; 

        for (int i = 0; i < queries.length; i++){ 
            result[i] = rotate(answer, queries[i]); 
        }
         
        return result; 
    } 
     
    private int rotate(int[][] answer, int[] query){ 
        int row = query[0] - 1; 
        int col = query[1] - 1; 

        int prev = answer[row][col];
        int min = prev;
        int temp;

        // 오른쪽
        for (int i = 0; i < query[3] - query[1]; i++){ 
            temp = answer[row][col + 1]; 
            answer[row][col + 1] = prev;
            prev = temp;

            if (min > temp){ 
                min = temp; 
            }

            col++;
        } 

        // 아래
        for (int i = 0; i < query[2] - query[0]; i++){ 
            temp = answer[row + 1][col]; 
            answer[row + 1][col] = prev;
            prev = temp;

            if (min > temp){ 
                min = temp; 
            }

            row++;
        } 

        // 왼쪽
        for (int i = 0; i < query[3] - query[1]; i++){ 
            temp = answer[row][col - 1]; 
            answer[row][col - 1] = prev;
            prev = temp;

            if (min > temp){ 
                min = temp; 
            }

            col--;
        } 

        // 위
        for (int i = 0; i < query[2] - query[0]; i++){ 
            temp = answer[row - 1][col]; 
            answer[row - 1][col] = prev;
            prev = temp;

            if (min > temp){ 
                min = temp; 
            }

            row--;
        } 

        return min; 
    }  
}