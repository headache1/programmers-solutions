import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] check = new int[progresses.length];
        ArrayList <Integer> arraylist = new ArrayList<>();
        
        int count = 1;
        int place = 0;
        for (int i = 0; i < progresses.length; i++){
            while(progresses[i] + count * speeds[i] < 100){
                count+=1;
            }
            check[i] = count;
        }
        
        for (int i = 1; i < check.length; i++){
            if (check[i] != check[i-1]){
                arraylist.add(i-place);
                place = i;
            }
        }
        
        arraylist.add(check.length-place);
        
        return arraylist.stream().mapToInt(Integer::intValue).toArray();
    }
}