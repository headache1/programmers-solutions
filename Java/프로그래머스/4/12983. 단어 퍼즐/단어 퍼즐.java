import java.util.*;

class Solution {
    int[] dp;
    HashSet<String> set;

    public int solution(String[] strs, String t) {
        dp = new int[t.length() + 1];
        Arrays.fill(dp, -2);

        set = new HashSet<>(Arrays.asList(strs));

        return dfs(t, 0);
    }

    public int dfs(String t, int depth) {
        int answer = t.length() + 1;

        if (depth == t.length()) {
            return 0;
        }

        if (dp[depth] != -2) {
            return dp[depth];
        }

        for (int length = 1; length <= 5; length++) {

            if (depth + length > t.length()) {
                break;
            }

            String temp = t.substring(depth, depth + length);

            if (set.contains(temp)) {
                int result = dfs(t, depth + length);

                if (result != -1) {
                    answer = Math.min(answer, result + 1);
                }
            }
        }

        dp[depth] = (answer == t.length() + 1) ? -1 : answer;

        return dp[depth];
    }
}