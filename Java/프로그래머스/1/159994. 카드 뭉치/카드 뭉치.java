class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < goal.length; i++){
            if (count1 < cards1.length && goal[i].equals(cards1[count1])){
                count1+=1;
            }
            else if (count2 < cards2.length && goal[i].equals(cards2[count2])){
                count2+=1;
            }
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}