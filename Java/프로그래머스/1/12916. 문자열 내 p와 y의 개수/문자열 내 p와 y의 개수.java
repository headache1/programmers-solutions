class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String lower = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        for (int i = 0; i < lower.length(); i++){
            if (lower.charAt(i) == 'p'){
                p+=1;
            }
            if (lower.charAt(i) == 'y'){
                y+=1;
            }
        }
        if (p==y){
            answer = true;
        }

        return answer;
    }
}