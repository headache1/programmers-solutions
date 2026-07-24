class Solution {
    public String solution(String s) {
        int n = 0;
        s = s.toLowerCase();
        String answer = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                n = 0;
                answer += s.charAt(i);
            }
            else if (n%2 == 0){
                answer += Character.toUpperCase(s.charAt(i));
                n+=1;
            }
            else if (n%2 == 1){
                answer += s.charAt(i);
                n+=1;
            }
        }
        
        return answer;
    }
}