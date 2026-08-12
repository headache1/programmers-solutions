import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList <Integer> list = new ArrayList<>();
        for (int x : people){
            list.add(x);
        }
        Collections.sort(list);
        
        int left = 0;
        int right = list.size()-1;
        
        while (list.size() >=2){
            if (list.get(left) + list.get(right) <= limit){
                list.remove(right);
                list.remove(left);
                answer += 1;
                right = list.size()-1;
            }
            else if (list.get(left) + list.get(right) > limit){
                list.remove(right);
                answer+=1;
                right = list.size()-1;
            }
        }
        return answer + list.size();
    }
}

/*
구하고자 하는 것 : 구명보트 최소 개수

의문점 : 30 30 50 70 으로 하면 순서대로 하면 3번이지만, 탐욕법으로는 2번

해결 자료구조 : sort하고 왼쪽부터랑 오른쪽부터랑 따로 세서 
*/