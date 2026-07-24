class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int row = 1; row <= (brown+yellow) / 2 ; row++){
            if ((brown + yellow) % row == 0){
                int col = (brown + yellow) / row;
                if ((row+col-2 == brown/2) && ((row-2)*(col-2) == yellow)){
                    answer[0] = row;
                    answer[1] = col;
                }
            }
        }
        return answer;
    }
}