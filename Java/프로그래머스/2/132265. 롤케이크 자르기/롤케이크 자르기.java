import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap <Integer, Integer> young = new HashMap <>();
        young.put(topping[0], young.getOrDefault(topping[0], 0)+1);
        HashMap <Integer, Integer> old = new HashMap <>();
        for (int i = 1; i < topping.length; i++){
            old.put(topping[i], old.getOrDefault(topping[i], 0)+1);
        }
        for (int i = 1; i < topping.length-1;i++){
            young.put(topping[i], young.getOrDefault(topping[i], 0)+1);
            old.put(topping[i], old.getOrDefault(topping[i], 0)-1);
            if (old.get(topping[i]) == 0){
                old.remove(topping[i]);
            }
            if (young.size() == old.size()){
                answer+=1;
            }
        }
        return answer;
    }
}