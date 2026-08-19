import java.util.*;

class Solution {

    static class Node {
        String word;
        int distance;

        Node(String word, int distance) {
            this.word = word;
            this.distance = distance;
        }
    }

    public int solution(String begin, String target, String[] words) {

        boolean[] visited = new boolean[words.length];

        ArrayDeque<Node> queue = new ArrayDeque<>();

        // 시작 상태
        queue.offer(new Node(begin, 0));

        while (!queue.isEmpty()) {

            Node now = queue.poll();

            String current = now.word;
            int distance = now.distance;

            // target 도착 검사
            if (current.equals(target)) {
                return distance;
            }

            // words 중 다음으로 갈 수 있는 단어 탐색
            for (int i = 0; i < words.length; i++) {

                if (visited[i]) {
                    continue;
                }
                
                int count = 0;
                String next = words[i];
                
                for (int j = 0; j < current.length(); j++){
                    if (current.charAt(j) != next.charAt(j)){
                        count++;
                    }
                }
                
                if (count == 1){
                    visited[i] = true;
                    queue.offer(new Node(next, distance + 1));
                }

            }
        }

        return 0;
    }
}