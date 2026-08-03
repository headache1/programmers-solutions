import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        int answer = set.size();
        if (set.size() > nums.length/2){
            answer = nums.length/2;
        }
        return answer;
    }
}

/*
[폰켓몬 1845]

목표: 가장 많은 종류의 포켓몬은 몇개?

순서 / 중복 / 연속성: 순서, 연속성 안 중요, 연속성은 아무래도 중복 때문에 중요

최대 입력과 예상 복잡도: O(n) n은 배열의 length

상태 / 자료구조: hashset 

한 단계마다 바뀌는 것: hashset에 배열 내용 입력하기

불변식: hashset 그 자체

종료 조건: hashset의 size 기반 result를 반환

시간 / 공간 복잡도: O(n) / O(n) n은 배열의 length

확인할 예외:
종류 수가 선택 가능한 수보다 많을 때
*/