import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap <String, Integer> map = new HashMap<>();
        HashMap <String, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < want.length; i++){
            map2.put(want[i],number[i]);
        }
        for (int i = 0; i < 10; i++){
            map.put(discount[i], map.getOrDefault(discount[i], 0)+1);
        }
        if (map.equals(map2)){
            answer+=1;
        }
        for (int i = 10; i < discount.length; i++){
            map.put(discount[i-10], map.getOrDefault(discount[i-10],0)-1);
            if (map.get(discount[i-10]) == 0){
                map.remove(discount[i-10]);
            }
            map.put(discount[i], map.getOrDefault(discount[i],0)+1);
            if (map.equals(map2)){
                answer+=1;
            }
        }
        return answer;
    }
}