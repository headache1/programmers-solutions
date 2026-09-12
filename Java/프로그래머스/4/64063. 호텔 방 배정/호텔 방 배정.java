import java.util.*;

class Solution {
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        HashMap<Long, Long> map = new HashMap<>();

        for (int i = 0; i < room_number.length; i++) { // 최대 20만
            if (!map.containsKey(room_number[i])) {
                map.put(room_number[i], room_number[i]);
                answer[i] = room_number[i];
                //System.out.println("first");
            }
            else if (map.containsKey(room_number[i])) {
                long temp = map.get(room_number[i]) + 1;
                ArrayList <Long> check = new ArrayList<>();
                check.add(room_number[i]);
                while (map.containsKey(temp)){
                    check.add(temp);
                    temp = map.get(temp)+1;
                }
                for (int j = 0; j < check.size(); j++){
                    long t = check.get(j);
                    map.put(t, temp);
                }
                map.put(temp, temp);

                answer[i] = temp;
                check.clear();
            }
        }

        return answer;
    }
}