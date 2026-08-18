import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Object[][] list = new Object[plays.length][3];
        HashMap <String, Integer> map = new HashMap<>();
        for (int i = 0; i < plays.length; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
            list[i] = new Object[]{genres[i], plays[i], i};
        }
        Arrays.sort(list, (a, b) -> {
            int cmp = ((String) a[0]).compareTo((String) b[0]);
            
            if (cmp != 0) {
                return cmp;
            }
            return Integer.compare((int) b[1], (int) a[1]);
        });
        
        ArrayList<Integer> answer = new ArrayList<>();
        List<Map.Entry<String, Integer>> list2 =new ArrayList<>(map.entrySet());

        list2.sort((a, b) ->
            Integer.compare(b.getValue(), a.getValue())
        );
        for(int i = 0; i < list2.size();i++){
            int count = 0;
            for (int j = 0; j < list.length; j++){
                
                if (count >= 2){
                    break;
                }
                if (list2.get(i).getKey().equals((String)list[j][0])){
                    answer.add((int)list[j][2]);
                    count += 1;
                }
            }
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}

/*
반환값 : 장르별 가장 많이 재생된 노래를 최대 2개까지

int 써도 됨

풀이예상 1 : TreeMap이랑 Object[][3] 을 둘 다 쓴다.
HashMap으로는 총 개수를, 이중배열로는 장르, play 순서, 해당 위치를 저장한다.
*/
