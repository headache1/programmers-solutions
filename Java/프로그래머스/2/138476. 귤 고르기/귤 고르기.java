import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : tangerine){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int[] list = new int[map.size()];
        int i = 0;
        for (int value : map.values()){
            list[i] = value;
            i++;
        }
        
        Arrays.sort(list);
        int sum = 0;
        for (int j = list.length-1; j >= 0; j--){
            sum += list[j];
            answer += 1;
            if (sum >= k){
                break;
            }
        }
        return answer;
    }
}

/*
반환해야 하는 것 : 서로 다른 종류의 과일 최솟값

long 사용 여부 : 1천만이라 사용해야 할 것 같음

쓰고 싶은 자료구조 : hashmap을 쓰고, value만 추출해서 sort하면 편하지 않을까?

시간복잡도 예상 : 0(n)
*/