class Solution {
    public int solution(int num) {
        long current = num;
        int answer = 0;
        while (current != 1){
            if (answer >= 500){
                answer = -1;
                break;
            }
            else if (current%2 == 0){
                current/=2;
                answer+=1;
            }
            else if (current%2 == 1){
                current = current*3+1;
                answer +=1;
            }
            
        }
        return answer;
    }
}