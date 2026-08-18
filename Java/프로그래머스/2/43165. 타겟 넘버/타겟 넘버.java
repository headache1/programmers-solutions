class Solution {
    int[] numbers;
    int target;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        int answer = 0;
        int index = 0;
        int sum = 0;
        answer = dfs(index, sum);
        return answer;
    }
    
    int dfs(int index, int sum){
        if (index == numbers.length) {
            if (sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        return dfs(index + 1, sum + numbers[index]) + dfs(index + 1, sum - numbers[index]);
    }
}