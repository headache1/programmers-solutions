import java.util.*;

class Solution {

    public long solution(String expression) {

        char[] operator = new char[3];
        boolean[] visited = new boolean[3];

        ArrayList<Long> num = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();

        String number = "";

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                number += expression.charAt(i);
            }
            else {
                num.add(Long.parseLong(number));
                number = "";

                operators.add(expression.charAt(i));
            }
        }

        num.add(Long.parseLong(number));

        return dfs(0, visited, operator, num, operators);
    }


    public long dfs(
            int depth,
            boolean[] visited,
            char[] operator,
            ArrayList<Long> num,
            ArrayList<Character> operators) {

        char[] oper = new char[]{'-', '+', '*'};

        long max = 0;

        if (depth == 3) {

            // 현재 우선순위 계산용 복사본
            ArrayList<Long> tempNum = new ArrayList<>(num);
            ArrayList<Character> tempOperators = new ArrayList<>(operators);

            for (char x : operator) {

                for (int i = 0; i < tempOperators.size(); i++) {

                    if (x == tempOperators.get(i)) {

                        long temp = 0;

                        if (x == '*') {
                            temp = tempNum.get(i) * tempNum.get(i + 1);
                        }

                        if (x == '-') {
                            temp = tempNum.get(i) - tempNum.get(i + 1);
                        }

                        if (x == '+') {
                            temp = tempNum.get(i) + tempNum.get(i + 1);
                        }

                        // num[i], num[i+1]을 계산 결과 하나로 합침
                        tempNum.set(i, temp);
                        tempNum.remove(i + 1);

                        // 사용한 연산자 제거
                        tempOperators.remove(i);

                        // 삭제되면서 다음 연산자가 현재 i 위치로 당겨졌으므로
                        // 같은 위치를 다시 검사
                        i--;
                    }
                }
            }

            return Math.abs(tempNum.get(0));
        }


        for (int i = 0; i < 3; i++) {

            if (!visited[i]) {

                visited[i] = true;
                operator[depth] = oper[i];

                max = Math.max(
                    max,
                    dfs(depth + 1, visited, operator, num, operators)
                );

                visited[i] = false;
            }
        }

        return max;
    }
}