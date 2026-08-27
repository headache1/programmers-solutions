class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        answer[0] = -1;
        answer[1] = -1;
        int left = 0;
        int right = 0;
        
        int sum = sequence[0];
        while (right < sequence.length){
            if (sum < k){
                right++;
                if (right >= sequence.length) {
                    break;
                }
                sum+=sequence[right];
            }
            if (sum > k){
                sum-=sequence[left];
                left++;
            }
            
            if (sum == k) {
                if (answer[0] == -1) {
                    answer[0] = left;
                    answer[1] = right;
                }
                else if (answer[1] - answer[0] > right - left) {
                    answer[0] = left;
                    answer[1] = right;
                }

                sum -= sequence[left];
                left++;
            }
        }
        return answer;
    }
}