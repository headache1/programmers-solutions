import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int rightA = A.length-1;
        int rightB = B.length-1;
        boolean[] visited = new boolean[B.length];
        while (rightA >= 0){
            if (A[rightA] < B[rightB]){
                rightB--;
                rightA--;
                answer++;
            }
            else if(A[rightA] >= B[rightB]){
                rightA--;
            }
        }
        return answer;
    }
}

/*
반환값 : 최대 승점

int 써도 됨

그냥 a sort 한 뒤에, b도 sort해서 

*/