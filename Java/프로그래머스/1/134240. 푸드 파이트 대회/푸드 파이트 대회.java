class Solution {
    public String solution(int[] food) {
        String answer = "";
        long length = 0;
        for (int i = 1; i < food.length; i++){
            if (food[i] % 2 == 1){
                food[i] -=1;
            }
            food[i] /=2;
            for (int j = 0; j < food[i]; j++){
                answer += String.valueOf(i);
            }
        }
        
        String result = answer;
        result += '0';
        for (int i = answer.length()-1; i >=0; i--){
            result+=answer.charAt(i);
        }
        return result;
    }
}