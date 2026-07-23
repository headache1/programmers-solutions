import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] err = {-1};
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for (int num : arr){
            min = Math.min(min, num);
        }
        if (arr.length == 1){
            return err;
        }
        int n = 0;
        int k = 0;
        for (int num : arr){
            if (arr[k] != min){
                answer[n] = arr[k];
                n++;
                k++;
            }
            else{
                k++;
            }
        }
        return answer;
    }
}