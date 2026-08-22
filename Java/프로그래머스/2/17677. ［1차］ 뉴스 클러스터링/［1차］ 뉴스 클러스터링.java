import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        HashMap <String, Integer> first = new HashMap<>();
        HashMap <String, Integer> second = new HashMap<>();
        
        int total = 0;
        for (int i = 0; i < str1.length()-1; i++){
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);
            if (isAlphabet(a) && isAlphabet(b)) {
                String temp = "" + a + b;
                first.put(temp, first.getOrDefault(temp, 0) + 1);
                total++;
            }
        }
        for (int i = 0; i < str2.length()-1; i++){
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);

            if (isAlphabet(a) && isAlphabet(b)) {
                String temp = "" + a + b;
                second.put(temp, second.getOrDefault(temp, 0) + 1);
                total++;
            }
        }
        
        int minus = 0;
        for (Map.Entry<String, Integer> entry : first.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            if (second.containsKey(key)){
                minus += Math.min(value, second.get(key));
            }
        }
        if (total == 0){
            return 65536;
        }
        double j = (double)minus / (double)(total-minus);
        return (int) (j * 65536);
    }
    
    private boolean isAlphabet(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}


/*

반환값 : 두글자씩 나눠서 받은 거에 자카드 유사도 에 (int)* 65536

그냥 string임

예외처리 : 대소문자 무시, 영어 제외 무시

풀이예상1 :
a.일단 전부 소문자 처리
b. str1과 str2를 예외를 처리해서 각각 HashMap에 넣기
c. 교집합은 containskey로 처리, 합집합은 두개의 value 합에 교집합 수만큼 빼기
d. 만일 둘 중 하나가 텅비면 무조건 65536


시간복잡도 예상 : n
*/