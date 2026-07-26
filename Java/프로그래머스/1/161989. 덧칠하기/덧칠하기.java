class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int left = section[0];
        for (int i = 1; i < section.length;i++){
            if (section[i] < left+m){
                continue;
            }
            else{
                left = section[i];
                answer+=1;
            }
        }
        return answer;
    }
}