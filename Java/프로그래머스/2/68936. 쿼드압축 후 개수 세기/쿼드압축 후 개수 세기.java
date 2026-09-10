class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                int check = 0;
                if (visited[i][j]){
                    continue;
                }
                if (!visited[i][j]){
                    int count = 1;
                    while(check != 1){
                        int main = arr[i][j];
                        if (i % count != 0 || j % count != 0){
                            check = 1;
                        }
                        if (i + count > arr.length || j + count > arr.length){
                            check = 1;
                        }
                        
                        outer:
                        if (i + count <= arr.length && j + count <= arr[0].length){
                            for (int k = 0; k < count; k++){
                                for (int k2 = 0; k2 < count; k2++){
                                    if (arr[i+k][j+k2] != main){
                                        check = 1;
                                        break outer;
                                    }
                                }
                            }
                        }
                        
                
                        if (check == 0){
                            count *= 2;
                        }
                        if (check == 1){
                            if (main == 0){
                                answer[0] += 1;
                                if (count >= 4){
                                    //System.out.println("0 : " +  i + "and" + j);
                                }
                            }
                            else if (main == 1){
                                answer[1] += 1;
                                if (count >= 4){
                                    //System.out.println("1 : " +  i + "and" + j);
                                }
                            }
                            if (count > 1){
                                count /=2;
                            }
                            for (int k = 0; k < count; k++){
                                for (int k2 = 0; k2 < count; k2++){
                                    visited[i+k][j+k2] = true;
                                }
                            }
                        }
                        
                    }
                }
            }
        }
        return answer;
    }
}


/*
반환값 : 0이 차지하는 칸 수, 1이 차지하는 칸 수

int 써도 됨

풀이예상 1 : 전체적으로 순회하면서, 만일 전부 0 혹은 1이면 *2 로 해서 다시 체크 

*/