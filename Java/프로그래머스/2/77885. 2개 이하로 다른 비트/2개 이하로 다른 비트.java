class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            String check = "0";
            check += Long.toString(numbers[i], 2);
            StringBuilder sb = new StringBuilder(check);
            int count = 0;
            if (check.charAt(check.length() - 1) == '0'){
                sb.setCharAt(check.length()-1, '1');
                count = 1;
            }
            else{
                for (int j = check.length()-2; j>=1; j--){
                    if (check.charAt(j) == '0'){
                        sb.setCharAt(j, '1');
                        sb.setCharAt(j+1, '0');
                        count = 1;
                        break;
                    }
                }
            }
            if (count == 0){
                sb.setCharAt(0,'1');
                sb.setCharAt(1,'0');
            }
            
            check = sb.toString();
            
            answer[i] = Long.parseLong(check, 2);
        }
        return answer;
    }
}