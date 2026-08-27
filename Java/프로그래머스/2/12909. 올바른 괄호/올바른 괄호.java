class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        if (arr[0] == ')'){
            answer = false;
        }
        int check = 1;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == '('){
                check+=1;
            }
            else{
                check-=1;
            }
            if (check < 0){
                answer = false;
            }
        }
        if (check != 0){
            answer = false;
        }

        return answer;
    }
}