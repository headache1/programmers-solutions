import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        //a
        for (int i = 0; i < plans.length; i++){
            String[] timing = plans[i][1].split(":");
            String time = Integer.toString(Integer.parseInt(timing[0])*60 + Integer.parseInt(timing[1]));
            plans[i][1] = time;
        }
        
        Arrays.sort(plans, (a,b) -> {
            if (!a[1].equals(b[1])){
                return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
            }
            return 0;
        });
        
        //b
        int place = 0;
        ArrayDeque <int[] > stack = new ArrayDeque<>();
        for (int i = 0; i < plans.length; i++){
            int time = Integer.parseInt(plans[i][1]);
            int how_long = Integer.parseInt(plans[i][2]);
            int next = 0;
            if (i + 1 == plans.length){
                next = time + how_long;
            }
            else{
                next = Integer.parseInt(plans[i+1][1]);
            }
            
            if (next < time + how_long){
                stack.push(new int[]{i, how_long - next + time});
            }
            if (next >= time + how_long){
                answer[place] = plans[i][0];
                place++;
                int time_left = next - how_long - time;
                while (time_left > 0 && !stack.isEmpty()) {
                    int[] left = stack.pop();

                    if (left[1] <= time_left) {
                    // 남은 과제를 완전히 끝냄
                        answer[place] = plans[left[0]][0];
                        place++;

                        time_left -= left[1];
                    } else {
                    // 빈 시간 동안 일부만 진행
                        left[1] -= time_left;
                        stack.push(left);

                        time_left = 0;
                    }
                }
            }
        }
        
        while (!stack.isEmpty()){
            int[] left = stack.pop();
            answer[place] = plans[left[0]][0];
            place++;
        }
        return answer;
    }
}


/*

반환값 : 얼마나 걸렸어요?

string

풀이예상1
a. 시간을 분으로 바꿔서, 내림차순으로 정렬
b. stack으로 받아서 바로 뒤랑 비교했을 때 시간 차까지 기록 
c. 

*/