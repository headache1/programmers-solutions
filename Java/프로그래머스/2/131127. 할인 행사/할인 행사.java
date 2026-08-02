import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map <String, Integer> map_want = new HashMap<>();
        Map <String, Integer> map_discount = new HashMap<>();
        for (int i = 0; i < want.length; i++){
            map_want.put(want[i], number[i]);
        }
        for (int i = 0; i < 10; i++){
            map_discount.put(discount[i], map_discount.getOrDefault(discount[i], 0) + 1);
            if (map_want.equals(map_discount)){
                answer +=1;
            }
        }
        for (int i = 10; i < discount.length; i++){
            map_discount.put(discount[i-10], map_discount.getOrDefault(discount[i-10], 0) - 1);
            map_discount.put(discount[i], map_discount.getOrDefault(discount[i], 0) + 1);
            if (map_discount.get(discount[i-10]) == 0){
                map_discount.remove(discount[i-10]);
            }
            if (map_want.equals(map_discount)){
                answer +=1;
            }
        }   
        return answer;
    }
}