import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[][] store = new String[files.length][3];
        
        for (int i = 0; i < files.length; i++){
            store[i][0] = "";
            store[i][1] = "";
            
            String word = files[i].toLowerCase();
            int place = 0;
            while (!(word.charAt(place) >= '0' && word.charAt(place) <= '9')){
                store[i][0] += word.charAt(place);
                place++;
            }
            while (place < word.length() && word.charAt(place) >= '0' && word.charAt(place) <= '9'){
                store[i][1] += word.charAt(place);
                place++;
            }
            store[i][2] = Integer.toString(i);
        }
        
        Arrays.sort(store, (a, b) -> {
            if (!a[0].equals(b[0])) {
                return a[0].compareTo(b[0]);
            }

            if (Integer.parseInt(a[1]) != Integer.parseInt(b[1])) {
                return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
            }

            return Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
        });
        
        String[] answer = new String[store.length];
        for (int i = 0; i < store.length;i++){
            int index = Integer.parseInt(store[i][2]);
            answer[i] = files[index];
        }
        return answer;
    }
}