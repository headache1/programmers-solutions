import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n,k);
        String[] numlist = num.split("0");
        for (int i = 0; i < numlist.length; i++){
            if (numlist[i].equals("") || numlist[i].equals("1")){
                continue;
            }
            long temp = Long.parseLong(numlist[i]);
            int check = 0;
            for (long j = 2; j*j <= temp; j++){
                if (temp % j == 0){
                    check = 1;
                    break;
                }
            }
            if (check == 0){
                answer += 1;
            }
        }
        return answer;
    }
}

/*
반환값 : 규칙에 맞는 소수는 총 몇개?

string 이나 int 쓰기

풀기 예상1 :
a. 저걸 Integer.toString(n,k) 친다
b. 0을 기준으로 split() 한다
c. 각각의 원소를 Integer.parseInt로 다시 변환한 뒤, 그것이 소수가 맞는지 판정한다.

*/