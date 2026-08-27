import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] list = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            list[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(list, (a, b) -> (b + a).compareTo(a + b));

        if (list[0].equals("0")) {
            return "0";
        }

        String answer = "";

        for (String number : list) {
            answer += number;
        }

        return answer;
    }
}