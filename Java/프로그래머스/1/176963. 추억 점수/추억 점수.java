class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int index = 0;
        for (String[] row : photo){
            answer[index] = 0;
            for (String element : row){
                for (int i = 0; i < name.length; i++){
                    if (element.equals(name[i])){
                        answer[index] += yearning[i];
                    }
                }
            }
            index +=1;
        }
        return answer;
    }
}