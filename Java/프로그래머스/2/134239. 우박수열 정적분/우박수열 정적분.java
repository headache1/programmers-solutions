class Solution {
    public double[] solution(int k, int[][] ranges) {
        int n = 0;
        int save = k;
        while (k != 1){
            if (k % 2 == 0){
                k /= 2;
                n++;
            }
            else if(k % 2 == 1){
                k = k*3 +1;
                n++;
            }
        }
        double[] weight = new double[n];
        k = save;
        double prev = k;
        int place = 0;
        while (k != 1){
            if (k % 2 == 0){
                k /= 2;
                weight[place] = (prev + k) /2;
                place++;
                prev = k;
            }
            else if(k % 2 == 1){
                k = k*3 +1;
                weight[place] = (prev + k) / 2;
                place++;
                prev = k;
            }
        }
        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++){
            double temp = 0;
            if (n+ranges[i][1] < ranges[i][0]){
                answer[i] = -1;
            }
            else{
                for (int j = ranges[i][0]; j < n+ranges[i][1]; j++){
                    temp += weight[j];
                }
                answer[i] = temp;
            }
            
        }
        
        return answer;
    }
}