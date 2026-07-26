class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            int length = 0;
            String previous = "";

            while (true) {
                String current = "";

                if (length + 2 <= babbling[i].length()
                        && (babbling[i].substring(length, length + 2).equals("ye")
                        || babbling[i].substring(length, length + 2).equals("ma"))) {

                    current = babbling[i].substring(length, length + 2);

                } else if (length + 3 <= babbling[i].length()
                        && (babbling[i].substring(length, length + 3).equals("aya")
                        || babbling[i].substring(length, length + 3).equals("woo"))) {

                    current = babbling[i].substring(length, length + 3);

                } else {
                    break;
                }

                // 바로 이전 발음과 같으면 불가능
                if (current.equals(previous)) {
                    break;
                }

                previous = current;
                length += current.length();

                // 문자열 끝까지 정확히 읽었으면 발음 가능
                if (length == babbling[i].length()) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}