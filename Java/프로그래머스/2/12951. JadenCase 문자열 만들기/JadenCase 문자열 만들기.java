class Solution {
    public String solution(String s) {
        String answer = "";
        String lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++){
            if (i==0){
                answer += Character.toUpperCase(lower.charAt(i));
            }
            else if (lower.charAt(i-1) == ' '){
                answer += Character.toUpperCase(lower.charAt(i));
            }
            else{
                answer += lower.charAt(i);
            }
        }
        return answer;
    }
}

/*
[JadenCase 문자열 만들기 12951]

목표: 단어별 맨 앞글자만 대문자, 나머지는 소문자

순서 / 중복 / 연속성: 순서 중요(맨 앞글자만), 중복 x, 연속성 x

최대 입력과 예상 복잡도: 문장의 길이=n이라 할 때 O(n)

상태 / 자료구조: 애초에 자료구조 자체가 필요 x

한 단계마다 바뀌는 것: 첫글자면 대문자, 아니면 소문자

불변식: 문장 그 자체

종료 조건: 맨 마지막까지 다루었을때

시간 / 공간 복잡도: 문장의 길이=n이라 할 때 O(n) (공간도 O(n))

확인할 예외: 
숫자로 시작할 경우(다만, 대문자 처리를 하든 말든 숫자는 변화 없어서 체크할 필요는 x)
*/