import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> list = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            if (list.contains(city)) {
                // 캐시 hit
                answer += 1;

                // 기존 위치에서 제거하고 가장 최근 위치로 이동
                list.remove(city);
                list.offer(city);
            } else {
                // 캐시 miss
                answer += 5;

                // 캐시가 꽉 찼으면 가장 오래된 도시 제거
                if (list.size() == cacheSize) {
                    list.poll();
                }

                list.offer(city);
            }
        }

        return answer;
    }
}