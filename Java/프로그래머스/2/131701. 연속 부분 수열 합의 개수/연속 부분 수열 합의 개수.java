import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet <Integer> set = new HashSet<>();
        int x = 0;
        for (int i = 1; i <=elements.length; i++){
            int sum = 0;
            for (int k = 0; k < elements.length; k++){
                for (int y= 0; y< i;y++){sum+=elements[(k+y)%elements.length];}
                set.add(sum);
                sum = 0;
            }
        }
        return set.size();
    }
}

/*
반환값 : 합으로 나올 수 있는 모든 경우의 수

-int만 써도 충분

자료구조? : Hashset 써서 그냥 모든 경우의 수 돌려도 될 듯? 

예외처리 : 마지막 꺼는 첫 번째꺼랑 연결되어야 하니, 그냥 끝까지 돌리되, %로 자르면 될 듯.
*/