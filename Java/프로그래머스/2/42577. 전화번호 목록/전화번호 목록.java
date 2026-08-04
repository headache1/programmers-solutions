import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length ; i++){
            set.add(phone_book[i]);
            int len = phone_book[i].length();
            for (int j = 0; j < len; j++){
                if (set.contains(phone_book[i].substring(0,j))){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}

/*
[전화번호 목록 42577]

목표: 어떤 것이 다른 것의 접두어가 되는 경우가 1건이라도 있는가? 

순서 / 중복 / 연속성: 순서, 연속성 x, 중복은 접두어가 중복되어야 하니 중요

최대 입력과 예상 복잡도: O(n*L)

단순 풀이와 예상 연산량: 

후보 접근 1: 전체 비교
상태 / 자료구조: 이중반복문
예상 복잡도: O(n(n+1)/2)

후보 접근 2: 해시에 넣어서 비교
상태 / 자료구조: hashset
예상 복잡도: O(n*L)

선택한 접근과 다른 접근을 버린 이유: 2, 시간복잡도가 작아서

한 단계마다 바뀌는 것: 해시에 들어가는 원소들

불변식: 해시에 리스트의 원소들이 add된다.

종료 조건:

시간 / 공간 복잡도:

확인할 예외:
전화번호 1개 / 길이가 같은 번호들 /
앞부분을 많이 공유하지만 접두어는 아닌 번호들 /
접두어 관계가 입력의 첫 번째·마지막 번호에 있는 경우
*/
