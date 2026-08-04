# Java 코딩테스트 학습일지

시작일: 2026-08-02
목표일: 2026-09-01
기준 언어: Java
핵심 완료 기준: 제출 통과가 아니라 다음 날 빈 화면에서 다시 구현할 수 있는가

---

## 운영 규칙

1. 기존 GitHub 코드, 이전 제출 코드, 다른 사람의 풀이를 먼저 보지 않는다.
2. 문제를 열면 코딩부터 하지 않고 아래의 코딩 전 뼈대를 먼저 작성한다.
3. 제한 시간이 끝나면 거의 다 풀었더라도 일단 중단하고 막힌 지점을 기록한다.
4. 알고리즘 힌트는 H1 → H2 → H3 순서로만 사용한다.
5. Java 문법과 API만 검색한 경우 알고리즘 힌트로 세지 않지만 `J`로 기록한다.
6. 정답 구조나 코드를 본 문제는 반드시 코드를 닫고 D0 빈 화면 재구현을 한다.
7. 복습은 D0 / D1 / D3 / D7 일정으로 진행한다.
8. 문제 수보다 무힌트 재현 여부를 진도 기준으로 삼는다.
9. 작성한 뼈대의 잘못된 문장은 삭제하지 않고 `~~기존 문장~~ → 수정 문장`으로 교정 이력을 남긴다.

### 힌트 단계

| 단계 | 의미 |
|---|---|
| H0 | 알고리즘 힌트 없이 풀이 |
| H1 | 알고리즘 분류 한 단어만 확인 |
| H2 | 핵심 관찰을 질문 한 문장으로 확인 |
| H3 | 상태, 불변식, 의사코드까지 확인한 뒤 재구현 |
| J | Java 문법 또는 API만 검색 |

### 막힘 코드

| 코드 | 의미 |
|---|---|
| R | 지문 이해 |
| C | 제약 또는 복잡도 판단 |
| A | 알고리즘 선택 |
| J | Java 문법/API |
| B | 경계 조건 |
| D | 디버깅 |

### 등급과 복습

| 등급 | 판정 | 복습 |
|---|---|---|
| A | 35분 이내 무힌트 해결 | D7 |
| B | 50분 이내 무힌트 해결 | D3, D7 |
| C | H1/H2 후 독립 구현 | D0, D1, D3, D7 |
| D | H3/코드 확인 후 빈 화면 재구현 | D0, D1, D3, D7 |
| E | 설명을 본 뒤에도 재구현 실패 | 개념 보강 후 D0 재시작 |

---

## 코딩 전 뼈대

앞으로 모든 문제는 아래 양식을 먼저 작성한 뒤 코딩한다.

```text
[문제명 / 문제 번호]

목표:
무엇을 반환해야 하는가?

순서 / 중복 / 연속성:

최대 입력과 예상 복잡도:

상태 / 자료구조:

한 단계마다 바뀌는 것:

불변식:
반복 중 항상 참이어야 하는 조건은 무엇인가?

종료 조건:

시간 / 공간 복잡도:

확인할 예외:
최소 입력 / 첫 번째·마지막 위치 / 중복 / 극값
```

가능한 접근이 둘 이상이면 아래 내용도 작성한다.

```text
접근 1:
예상 복잡도:

접근 2:
예상 복잡도:

선택한 접근:
다른 접근을 버린 이유:
```

---

## 문제 종료 후 기록 양식

```text
[문제명 / 문제 번호]

날짜:
결과: 통과 / 미통과
사용 시간:
힌트: H0 / H1 / H2 / H3
Java/API 검색: 없음 / 있음(J, 검색 내용)
기존 코드 열람: 없음 / 있음

읽기:
설계:
구현:
디버깅:

처음 생각한 접근:
불변식:
시간 / 공간 복잡도:
막힘 코드: R / C / A / J / B / D
가장 의심한 반례:

등급:
복습 일정: D0 / D1 / D3 / D7
```

---

## 진행 현황

| 날짜 | 문제 | 결과 | 시간 | 힌트/API | 등급·단계 | 다음 복습 |
|---|---|---:|---:|---|---|---|
| 8/2 | 할인 행사 (131127) | 통과 | 15분 | H0, 검색 없음 | A | D7 8/9 |
| 8/2 | 기능개발 (42586) | D0 통과 | 8분 | 코드 확인 | D | D1 8/3 |
| 8/3 | 기능개발 (42586) | D1 통과 | 7분 | H0, J | D1 성공 | D3 8/5, D7 8/9 |
| 8/3 | 정수 삼각형 (43105) | D0 통과 | 7분 | H3 | D | D1 8/4, D3 8/6, D7 8/10 |
| 8/3 | 완주하지 못한 선수 (42576), HashMap | 통과 | 10분 | H0, J | 방식 1 성공 | - |
| 8/3 | 완주하지 못한 선수 (42576), 정렬 | 통과 | 10분 | H0, 검색 없음 | 방식 2 성공 | - |
| 8/3 | 폰켓몬 (1845) | 통과 | 8분 | H0, 검색 없음 | A | D7 8/10 |
| 8/4 | JadenCase 문자열 만들기 (12951) | 1차 구현 | 11분 | H0, J | StringBuilder 첫 학습 | 진행 중 |

---

## 1. 할인 행사 (131127)

### 결과

```text
날짜: 2026-08-02
결과: 통과
시간: 15분
힌트: H0
Java/API 검색: 없음
등급: A
복습: D7 8/9
```

### 핵심 기록

```text
목표:
원하는 제품을 수량대로 모두 살 수 있는 연속된 10일의 시작일 개수를 반환한다.

문제의 성질:
10일 안의 구매 순서는 중요하지 않다.
제품별 중복 개수는 중요하다.
반드시 연속된 10일이어야 한다.

상태:
targetCounts와 현재 연속 10일을 담은 windowCounts.

불변식:
windowCounts는 현재 검사 중인 연속된 10일의 제품별 개수를 정확히 담는다.
개수가 0인 제품은 Map에 남아 있지 않는다.

시간 / 공간 복잡도:
n = discount 길이, w = want의 제품 종류 수
평균 시간 O(n × w), w가 최대 10이므로 실질적으로 O(n)
공간 O(w)

반례:
첫 번째 10일만 만족하는 경우
마지막 10일만 만족하는 경우
같은 제품이 10번 반복되는 경우
```

### 제출 코드

```java
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map_want = new HashMap<>();
        Map<String, Integer> map_discount = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map_want.put(want[i], number[i]);
        }

        for (int i = 0; i < 10; i++) {
            map_discount.put(discount[i], map_discount.getOrDefault(discount[i], 0) + 1);
            if (map_want.equals(map_discount)) {
                answer += 1;
            }
        }

        for (int i = 10; i < discount.length; i++) {
            map_discount.put(discount[i - 10], map_discount.getOrDefault(discount[i - 10], 0) - 1);
            map_discount.put(discount[i], map_discount.getOrDefault(discount[i], 0) + 1);

            if (map_discount.get(discount[i - 10]) == 0) {
                map_discount.remove(discount[i - 10]);
            }

            if (map_want.equals(map_discount)) {
                answer += 1;
            }
        }

        return answer;
    }
}
```

### 개선점

- 최초 10개의 빈도를 모두 센 뒤 반복문 밖에서 한 번만 비교하면 더 명확하다.
- `map_want` → `wantCounts`
- `map_discount` → `windowCounts`

---

## 2. 기능개발 (42586)

### 학습 이력

```text
최초 시도: 실패
정답 코드 확인: 있음
D0 빈 화면 재구현: 성공, 8분
등급: D

D1: 2026-08-03 성공, 7분
알고리즘 힌트: H0
기존 코드 열람: 없음
Java/API 검색: 있음(J)
검색 내용: ArrayList<Integer>를 int[]로 변환하는 Stream 문법

다음 복습:
D3 8/5
D7 8/9
```

### 핵심 기록

```text
상태:
현재 기능까지 앞선 기능의 배포 순서를 반영한 실제 배포 가능일.

불변식:
i번째 기능 처리 후 releaseDay는 0번부터 i번 기능까지의 완료일 최댓값이다.
따라서 releaseDays는 감소하지 않는다.

시간 / 공간 복잡도:
시간 O(n + D), D는 가장 늦은 배포일까지 증가한 날짜 수
문제 제약에서는 D가 작아 실질적으로 O(n)
공간 O(n)
```

### D1 재구현 코드

```java
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] check = new int[progresses.length];
        ArrayList<Integer> arraylist = new ArrayList<>();

        int count = 1;
        int place = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + count * speeds[i] < 100) {
                count += 1;
            }
            check[i] = count;
        }

        for (int i = 1; i < check.length; i++) {
            if (check[i] != check[i - 1]) {
                arraylist.add(i - place);
                place = i;
            }
        }

        arraylist.add(check.length - place);

        return arraylist.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

### 다음 복습의 변수명 개선

```text
check     → releaseDays
arraylist → batchSizes
count     → releaseDay
place     → batchStart
```

Stream을 기억하지 못하면 기본 반복문으로 변환한다.

```java
int[] answer = new int[batchSizes.size()];

for (int i = 0; i < batchSizes.size(); i++) {
    answer[i] = batchSizes.get(i);
}

return answer;
```

---

## 3. 정수 삼각형 (43105)

### 결과

```text
날짜: 2026-08-03
최초 시도: 구현하지 못함
힌트: H3
안내 구현: 성공
D0 빈 화면 재구현: 통과
재구현 시간: 7분
등급: D

복습:
D1 8/4
D3 8/6
D7 8/10
```

### 핵심 기록

```text
dp 상태:
dp[y][x]는 (y, x)에서 출발해 맨 아래까지 내려갈 때 얻을 수 있는 최대 합이다.

초기값:
삼각형의 마지막 줄을 dp의 마지막 줄에 복사한다.

점화식:
dp[y][x] = triangle[y][x] + max(dp[y+1][x], dp[y+1][x+1])

계산 순서:
아래에서 위로 계산한다.

답:
dp[0][0]

시간 / 공간 복잡도:
시간 O(h²)
공간 O(h²)
```

### D0 재구현 코드

```java
class Solution {
    public int solution(int[][] triangle) {
        int height = triangle.length;
        int[][] list = new int[height][height];

        for (int i = 0; i < height; i++) {
            list[height - 1][i] = triangle[height - 1][i];
        }

        for (int y = height - 2; y >= 0; y--) {
            for (int x = 0; x <= y; x++) {
                int left = list[y + 1][x];
                int right = list[y + 1][x + 1];

                list[y][x] = triangle[y][x] + Math.max(left, right);
            }
        }

        return list[0][0];
    }
}
```

다음 복습에서는 `list` 대신 `dp`라는 이름을 사용한다.

---

## 4. 완주하지 못한 선수 (42576)

### 방식 1: HashMap

```text
날짜: 2026-08-03
결과: 통과
시간: 10분
알고리즘 힌트: H0
Java/API 검색: 있음(J)
검색 내용: Map에서 값이 0이 아닌 key 하나를 찾아 String으로 반환하는 Stream 문법
```

#### 작성한 뼈대

```text
목표:
완주하지 못한 참가자 이름 한 명을 String으로 반환한다.

순서 / 중복 / 연속성:
순서는 중요하지 않다.
동명이인이 있으므로 중복은 중요하다.
연속성은 중요하지 않다.

최대 입력과 예상 복잡도:
평균 O(n), n은 participant.length.

상태 / 자료구조:
이름별 참가 횟수와 완주 횟수의 차이를 저장하는 HashMap.

한 단계마다 바뀌는 것:
참가자 이름은 1 증가시키고 완주자 이름은 1 감소시킨다.

불변식:
현재까지 처리한 각 이름의 값은 참가 횟수 - 완주 횟수이다.

종료 조건:
모든 입력을 처리하면 미완주자의 값만 1이고 나머지는 0이다.

시간 / 공간 복잡도:
평균 시간 O(n), 공간 O(n).

예외:
참가자가 한 명이고 completion이 비어 있는 경우.
동명이인 중 한 명만 완주하지 못한 경우.
미완주자와 같은 이름이 completion에도 존재하는 경우.
```

#### 제출 코드

```java
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            hashmap.put(participant[i], hashmap.getOrDefault(participant[i], 0) + 1);

            if (i != participant.length - 1) {
                hashmap.put(completion[i], hashmap.getOrDefault(completion[i], 0) - 1);
            }
        }

        return hashmap.keySet().stream()
                .filter(key -> hashmap.get(key) != 0)
                .findFirst()
                .get();
    }
}
```

Stream 대신 사용할 수 있는 기본 반복문:

```java
for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
    if (entry.getValue() > 0) {
        return entry.getKey();
    }
}

return "";
```

### 방식 2: 정렬

```text
날짜: 2026-08-03
결과: 통과
시간: 10분
힌트: H0
Java/API 검색: 없음
독립 구현: 성공
```

#### 핵심 기록

```text
불변식:
첫 번째 불일치 전까지 participant[i]와 completion[i]는 같다.
처음 다른 위치가 나오면 participant[i]가 미완주자다.
끝까지 모두 같으면 participant의 마지막 사람이 미완주자다.

시간 / 공간 복잡도:
시간 O(n log n)
Java 객체 배열 정렬의 추가 공간은 최악 O(n)
Arrays.sort가 입력 배열을 직접 변경한다.
```

#### 제출 코드

```java
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = participant[participant.length - 1];

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }

        return answer;
    }
}
```

---

## 5. 폰켓몬 (1845)

### 결과

```text
날짜: 2026-08-03
결과: 통과
시간: 8분
힌트: H0
Java/API 검색: 없음
기존 코드 열람: 없음
등급: A
복습: D7 8/10
```

### 작성한 뼈대와 교정

#### 목표

~~가장 많은 종류의 포켓몬은 몇 개?~~

→ `nums.length / 2`마리를 선택할 때 고를 수 있는 폰켓몬 종류 수의 최댓값을 반환한다.

#### 순서 / 중복 / 연속성

~~순서, 연속성 안 중요, 연속성은 아무래도 중복 때문에 중요~~

→ 순서와 연속성은 중요하지 않다. 입력의 중복은 중요하지만, 같은 번호는 하나의 종류로 센다.

#### 최대 입력과 예상 복잡도

`n = nums.length`일 때 평균 시간 O(n)을 예상한다.

#### 상태 / 자료구조

~~HashSet~~

→ 지금까지 확인한 폰켓몬의 서로 다른 종류 번호를 저장하는 `HashSet<Integer>`.

#### 한 단계마다 바뀌는 것

~~HashSet에 배열 내용 입력하기~~

→ `nums[i]`를 Set에 추가한다. 이미 존재하는 번호라면 Set은 바뀌지 않는다.

#### 불변식

~~HashSet 그 자체~~

→ `i`번째 원소까지 처리한 뒤 Set에는 `nums[0..i]`에 등장한 종류가 정확히 한 번씩 들어 있다.

#### 종료 조건

~~HashSet의 size 기반 result를 반환~~

→ 모든 번호를 처리한 뒤 `서로 다른 종류 수`와 `선택 가능한 마릿수 n/2` 중 작은 값을 반환한다.

#### 시간 / 공간 복잡도

평균 시간 O(n), 공간 O(k). `k`는 서로 다른 종류 수이며 최악에는 O(n)이다.

#### 확인할 예외

- 종류 수가 선택 가능한 마릿수보다 많은 경우
- 종류 수가 선택 가능한 마릿수보다 적은 경우
- 모든 번호가 같은 경우
- 모든 번호가 서로 다른 경우

### 제출 코드

```java
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int answer = set.size();
        if (set.size() > nums.length / 2) {
            answer = nums.length / 2;
        }

        return answer;
    }
}
```

같은 반환 로직을 다음처럼 줄일 수도 있다.

```java
return Math.min(set.size(), nums.length / 2);
```

---

## 6. JadenCase 문자열 만들기 (12951)

### 1차 구현 결과

```text
날짜: 2026-08-04
결과: 정답 로직 구현
시간: 11분
힌트: H0
Java/API 검색: 있음(J)
검색 내용: String.toLowerCase()
기존 코드 열람: 없음
학습 상태: StringBuilder를 처음 접함. 사용법을 학습한 뒤 재작성 예정
최종 등급: 재작성 후 확정
```

현재 코드는 문제의 반환값을 올바르게 만든다. 다만 반복문 안에서 `String +=`를 사용하므로 실제 시간복잡도는 O(n²)이다. StringBuilder는 이번에 처음 배우는 Java 도구이므로 미사용을 실패로 판정하지 않고 학습 후 재작성한다.

### 작성한 뼈대와 교정

#### 목표

~~단어별 맨 앞글자만 대문자, 나머지는 소문자~~

→ 각 단어의 첫 문자가 알파벳이면 대문자로, 그 밖의 알파벳은 소문자로 바꾸고 기존 공백을 그대로 보존한 문자열을 반환한다.

#### 순서 / 중복 / 연속성

~~순서 중요(맨 앞글자만), 중복 x, 연속성 x~~

→ 문자 순서와 공백 위치가 중요하다. 중복 여부는 중요하지 않으며 연속된 공백도 그대로 보존해야 한다.

#### 최대 입력과 예상 복잡도

~~문장의 길이를 n이라 할 때 O(n)~~

→ 목표 복잡도는 O(n)이지만, 현재 코드는 반복문 안의 `String +=` 때문에 실제 시간복잡도가 O(n²)이다.

#### 상태 / 자료구조

~~애초에 자료구조 자체가 필요 없음~~

→ 변환 결과를 누적할 `StringBuilder`와 현재 문자가 단어의 첫 문자인지 판단할 이전 문자 또는 `wordStart` 상태가 필요하다.

#### 한 단계마다 바뀌는 것

~~첫 글자면 대문자, 아니면 소문자~~

→ 현재 문자가 문자열의 첫 문자이거나 바로 앞 문자가 공백이면 대문자로 변환해 추가하고, 아니면 소문자로 추가한다.

#### 불변식

~~문장 그 자체~~

→ `i`번째 문자까지 처리한 뒤 결과에는 원본 `s[0..i]`가 JadenCase 규칙에 맞게 변환되어 있고 모든 공백 위치가 보존되어 있다.

#### 종료 조건

~~맨 마지막까지 다루었을 때~~

→ 모든 문자를 한 번씩 처리하면 `StringBuilder`가 완성된 JadenCase 문자열을 담고 있으므로 `toString()`으로 반환한다.

#### 시간 / 공간 복잡도

~~시간 O(n), 공간 O(n)~~

→ 현재 코드: 시간 O(n²), 최종 결과와 소문자 문자열의 공간 O(n).
→ StringBuilder 재작성 후: 시간 O(n), 공간 O(n).

#### 확인할 예외

~~숫자로 시작할 경우에는 대문자 처리를 해도 변화가 없어서 확인할 필요 없음~~

→ 숫자 자체는 대문자 변환의 영향을 받지 않지만, 같은 단어에서 숫자 뒤에 오는 알파벳이 소문자인지 확인해야 한다.

추가 반례:

- 연속된 공백이 있는 경우
- 한 글자 단어
- 숫자로 시작하는 단어
- 이미 대문자와 소문자가 섞여 있는 경우

### 1차 구현 코드

```java
class Solution {
    public String solution(String s) {
        String answer = "";
        String lower = s.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            if (i == 0) {
                answer += Character.toUpperCase(lower.charAt(i));
            } else if (lower.charAt(i - 1) == ' ') {
                answer += Character.toUpperCase(lower.charAt(i));
            } else {
                answer += lower.charAt(i);
            }
        }

        return answer;
    }
}
```

---

## 다음 과제

### JadenCase StringBuilder 재작성

```text
1단계: 아래 API를 보면서 기존 코드를 StringBuilder로 변경
1단계 시간: 평가하지 않음
기존 알고리즘: 그대로 사용
목표: String 연결만 StringBuilder로 교체
2단계: 동작 확인 후 코드를 닫고 5분 안에 다시 작성
```

기억할 API:

```java
StringBuilder answer = new StringBuilder();
answer.append(/* 변환한 문자 */);
return answer.toString();
```
