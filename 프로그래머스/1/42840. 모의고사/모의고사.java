import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int person = 0; person < 3; person++) {
                if (answers[i] == pattern[person][i % pattern[person].length]) {
                    score[person]++;
                }
            }
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        ArrayList<Integer> result = new ArrayList<>();

        for (int person = 0; person < 3; person++) {
            if (score[person] == max) {
                result.add(person + 1);
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}