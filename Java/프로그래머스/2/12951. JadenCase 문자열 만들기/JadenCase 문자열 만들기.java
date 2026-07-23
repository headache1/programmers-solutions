class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (i == 0 || s.charAt(i-1) == ' '){
                answer += Character.toUpperCase(s.charAt(i));
            }
            else{
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}