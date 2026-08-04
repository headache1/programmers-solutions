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
10. 뼈대에 잘못된 내용이 있으면 GitHub에 교정한 뒤, 다음 문제를 내기 전에 잘못된 부분과 수정 이유를 사용자에게 먼저 설명한다.
11. GitHub에 풀이가 없다는 이유만으로 실제 신규 문제라고 단정하지 않는다. 문제를 시작하기 전에 `처음 풂 / 전에 풀어봄 / 기억 안 남`을 확인하고 학습 모드를 정한다.

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
| 8/4 | JadenCase 문자열 만들기 (12951) | D0 통과 | 최초 11분, D0 4분 | H0, J | 알고리즘 A / Java 도구 D0 성공 | StringBuilder D1 8/5 |
| 8/4 | 정수 삼각형 (43105) | D1 통과 | 7분 | H0, 검색 없음 | 구현·설명·경계 테스트 성공 | D3 8/6, D7 8/10 |
| 8/4 | 전화번호 목록 (42577) | H3 안내 구현 | 안내 전 30분+, 안내 후 3분 | J(substring), H3 | D 후보 | D0 재구현 대기 |

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
학습 상태: StringBuilder를 처음 접한 뒤 사용법을 보면서 재작성 성공
문제 알고리즘: A(J)
Java 도구: StringBuilder D0 재구현 성공
도구 복습: D1 8/5
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

### StringBuilder 안내 구현 코드

```java
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String lower = s.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            if (i == 0) {
                answer.append(Character.toUpperCase(lower.charAt(i)));
            } else if (lower.charAt(i - 1) == ' ') {
                answer.append(Character.toUpperCase(lower.charAt(i)));
            } else {
                answer.append(lower.charAt(i));
            }
        }

        return answer.toString();
    }
}
```

안내 구현의 시간복잡도는 O(n), 공간복잡도는 O(n)이다.

### StringBuilder D0 재구현

```text
결과: 프로그래머스 제출 통과
시간: 4분
검색: 없음
코드 및 API 예시 열람: 없음
판정: D0 성공
다음 도구 복습: D1 8/5
```

---

## 7. 정수 삼각형 (43105) D1

### 구현 결과

```text
날짜: 2026-08-04
복습 단계: D1
구현 결과: 정답 코드 재현
시간: 7분
힌트: H0
검색: 없음
기존 코드 열람: 없음
판정: 구현 성공 / 설명·반례 보완 대기
```

### 작성한 뼈대와 교정

#### 목표

~~최대 크기~~

→ 꼭대기에서 시작해 인접한 아래 칸으로 이동할 때, 거쳐 간 숫자 합의 최댓값을 반환한다.

#### 최대 입력과 예상 복잡도

~~그냥 이중 배열 내에 있는 모든 원소의 개수~~

→ 높이를 `h`라고 하면 `1 <= h <= 500`이고 전체 칸 수는 `h(h+1)/2`이다. 모든 칸을 한 번씩 계산하는 O(h²), 전체 칸 수를 `N`이라고 표현하면 O(N)을 목표로 한다.

#### dp 상태

~~작성하지 않음~~

→ `dp[y][x]`는 `(y, x)`에서 출발해 맨 아래까지 내려갈 때 얻을 수 있는 최대 합이다.

#### 초기값(base)

~~맨 밑줄만 살려두기~~

→ 마지막 줄에서는 더 내려갈 곳이 없으므로 `dp[h-1][x] = triangle[h-1][x]`로 초기화한다.

#### 점화식(transition)

~~높이가 위에 있는 것은, 자기랑 맞닿은 2개 중 큰 것과의 합이다.~~

→ 현재 숫자에 바로 아래 두 칸에서 바닥까지 내려가는 최대 합 중 큰 값을 더한다.

```text
dp[y][x] = triangle[y][x] + max(dp[y+1][x], dp[y+1][x+1])
```

비교 대상은 바로 아래의 원본 숫자 두 개가 아니라, 두 칸에서 시작하는 전체 경로의 `dp` 값이다.

#### 계산 순서(order)

~~작성하지 않음~~

→ 마지막 줄을 초기화한 뒤 `y = h-2`부터 0까지 위로 올라가고, 각 줄에서 `x = 0`부터 `y`까지 계산한다.

#### 불변식

~~작성하지 않음~~

→ `y`번째 줄을 계산할 때 `y+1`번째 줄의 각 `dp` 값은 이미 바닥까지의 최대 합으로 완성되어 있다.

#### 종료 조건과 반환값(answer)

~~height = 0까지 계산~~

→ 반복 변수 `y`로 0번째 줄까지 계산하면 종료하고 `dp[0][0]`을 반환한다. 코드에는 `height`를 감소시키는 과정이 없다.

#### 시간 / 공간 복잡도

~~O(n log n)~~

→ 높이를 `h`라고 하면 시간 O(h²), 공간 O(h²)이다. 정렬하지 않으므로 O(n log n)이 아니다.

#### 확인할 예외

~~높이 1 / 양쪽 결과가 같은 경우 / 최적 경로가 가장자리에 있는 경우~~

→ 위 문장은 반례의 종류만 나열한 것이므로 아직 직접 반례를 만든 것은 아니다. 실제 삼각형 입력과 예상 반환값을 최소 한 개 작성해야 한다.

### D1 구현 코드

```java
class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length;
        int[][] dp = new int[h][h];

        for (int i = 0; i < h; i++) {
            dp[h - 1][i] = triangle[h - 1][i];
        }

        for (int y = h - 2; y >= 0; y--) {
            for (int x = 0; x <= y; x++) {
                int left = dp[y + 1][x];
                int right = dp[y + 1][x + 1];

                dp[y][x] = triangle[y][x] + Math.max(left, right);
            }
        }

        return dp[0][0];
    }
}
```

### D1 설명 회수

#### dp 상태

~~`triangle[y][x]` 위치에서 맨 아래까지 내려갔을 때 얻을 수 있는 최댓값~~

→ `dp[y][x]`는 `(y, x)` 위치에서 맨 아래까지 내려갔을 때 얻을 수 있는 **최대 합**이다.

#### 불변식

`y`보다 아래에 있는 줄들은 이미 정의한 dp 상태에 맞게 계산되어 있다.

더 정확히는 `y`번째 줄을 계산할 때 바로 아래 `y+1`번째 줄의 dp 값이 이미 완성되어 있다.

#### 시간 / 공간 복잡도

시간 O(h²), 공간 O(h²).

#### 경계 테스트

```text
triangle = [[1]]
expected = 1
이유: 마지막 줄 초기화로 dp[0][0]에 1이 저장되고, 위로 올라가는 반복문 없이 곧바로 반환한다.
```

#### D1 최종 판정

구현, dp 상태, 불변식, 복잡도, 경계 테스트를 모두 회수했으므로 D1 통과. 다음 복습은 D3 8/6, D7 8/10이다.

---

## 8. 전화번호 목록 (42577) 1차 구현

### 결과

```text
날짜: 2026-08-04
과거 풀이 여부: 전에 풀어봄
GitHub 기존 풀이: 확인되지 않음
시간: 18분
힌트: H0
Java/API 검색: 있음(J)
검색 내용: Java에는 슬라이스 문법이 있다고 잘못 기억해 디버깅한 뒤 String.substring() 검색
알고리즘 판정: 논리적으로 정답
제출 통과 여부: 확인 필요
등급: 제출 통과 시 A(J)
후속 작업: 정렬과 HashSet을 섞은 구현을 한 가지 방식으로 정리
```

### 코드 검토

현재 코드는 정렬 후 앞에서부터 번호를 Set에 넣는다. 어떤 번호가 다른 번호의 접두어라면 사전순 정렬에서 짧은 접두어가 긴 번호보다 먼저 오므로, 긴 번호의 접두어들을 확인할 때 Set에서 찾을 수 있다. 따라서 논리적으로 정답이다.

다만 정렬과 HashSet 중 하나만으로도 해결할 수 있으므로 두 자료구조를 함께 사용한 현재 코드는 불필요하게 복잡하다.

또한 `j = 0`일 때 `substring(0, 0)`은 빈 문자열이므로 확인할 필요가 없다. 접두어를 발견했을 때 `break`는 안쪽 반복문만 끝내므로, 전체 탐색을 끝내려면 곧바로 `return false`하는 편이 명확하다.

### 작성한 뼈대와 교정

#### 목표

~~어떤 것이 다른 것의 접두어가 되는 경우가 1건이라도 있는가?~~

→ 한 전화번호가 다른 전화번호의 접두어인 경우가 하나라도 있으면 `false`, 없으면 `true`를 반환한다.

#### 순서 / 중복 / 연속성

~~순서, 연속성 x, 중복은 접두어가 중복되어야 하니 중요~~

→ 입력 순서와 연속성은 중요하지 않다. 같은 전화번호는 입력에 중복되지 않으며, 접두어 관계는 중복과 다른 개념이다. 현재 코드는 사전순 정렬로 새로운 순서를 만든다.

#### 최대 입력과 예상 복잡도

~~O(n × L)~~

→ 이 항목에는 먼저 `n <= 1,000,000`, `L <= 20`을 적어야 한다. 현재 혼합 구현의 시간은 문자열 비교 비용까지 포함하면 O(n log n × L + n × L²)이다. `L <= 20`을 상수로 보면 O(n log n)으로 단순화할 수 있다.

#### 단순 풀이와 예상 연산량

~~작성하지 않음~~

→ 모든 번호 쌍을 비교하면 약 `n(n-1)/2`쌍이며, `n = 1,000,000`일 때 약 5천억 쌍이므로 불가능하다.

#### 후보 접근 1

~~전체 비교 / 이중 반복문 / O(n(n+1)/2)~~

→ 전체 비교는 Θ(n²)쌍을 검사하고 번호 비교에 최대 O(L)이 걸리므로 시간 O(n² × L)이다. `n(n+1)/2`는 연산 횟수 식이지 Big-O 표기가 아니다.

#### 후보 접근 2

~~해시에 넣어서 비교 / HashSet / O(n × L)~~

→ HashSet에 어떤 번호들이 들어 있는지와 각 번호에서 어떤 접두어를 생성하는지 정의해야 한다. Java의 `substring` 생성과 새 문자열의 해시 계산 비용까지 세면 최악 O(n × L²)이며, `L <= 20`에서는 실질적으로 선형에 가깝다.

#### 선택한 접근과 다른 접근을 버린 이유

HashSet을 사용한 접근을 선택하고 모든 번호 쌍을 비교하는 O(n²) 접근을 버린 판단은 맞다.

다만 실제 코드에서는 `Arrays.sort`도 사용했으므로 작성한 설계와 구현이 완전히 일치하지 않는다.

#### 한 단계마다 바뀌는 것

~~해시에 들어가는 원소들~~

→ 현재 코드를 기준으로는 사전순으로 다음 번호를 Set에 추가하고, 그 번호의 길이 1부터 `len-1`까지 접두어를 차례로 검사한다.

#### 불변식

~~해시에 리스트의 원소들이 add된다.~~

→ 현재 번호를 검사할 때 Set에는 사전순으로 현재 번호보다 앞에 있는 번호들이 모두 들어 있다. 현재 번호의 접두어가 존재한다면 접두어는 더 짧고 사전순으로 앞서므로 Set에서 찾을 수 있다.

#### 종료 조건

~~접두어가 되는 케이스 하나라도 발견 시 종료~~

→ 작성한 코드는 접두어 발견 시 안쪽 반복문만 종료한다. 설계와 일치시키려면 접두어를 발견하는 즉시 `return false`하고, 모든 번호를 검사해도 발견하지 못하면 `return true`한다.

#### 시간 / 공간 복잡도

~~O(n)~~

→ 현재 혼합 코드의 시간은 O(n log n × L + n × L²), 추가 공간은 HashSet과 정렬 보조 공간을 포함해 O(n)이다.

#### 확인할 예외

~~그딴 거 없음~~

→ 다음 경계를 직접 확인해야 한다.

- 전화번호가 하나뿐이면 `true`
- `["12", "123"]`은 `false`
- `["123", "12"]`도 입력 순서와 무관하게 `false`
- `["123", "124"]`는 앞부분을 공유하지만 접두어가 아니므로 `true`
- 길이가 같은 서로 다른 번호들은 서로의 접두어가 아니므로 `true`

### 1차 구현 코드

```java
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            set.add(phone_book[i]);
            int len = phone_book[i].length();

            for (int j = 0; j < len; j++) {
                if (set.contains(phone_book[i].substring(0, j))) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
```

---

### HashSet 전체 순회 시도와 효율성 실패

```text
안내 전 누적 시간: 30분 이상
정확성: 모두 통과
효율성: 테스트 3, 4 시간 초과
총점: 91.7 / 100
원인: 각 전화번호마다 for (String x : set)으로 Set 전체를 순회해 O(n² × L)
```

```java
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < phone_book.length; i++) {
            if (answer == false) {
                break;
            }

            for (String x : set) {
                if ((x.length() <= phone_book[i].length()
                        && phone_book[i].substring(0, x.length()).equals(x))
                        || (x.length() > phone_book[i].length()
                        && x.substring(0, phone_book[i].length()).equals(phone_book[i]))) {
                    answer = false;
                }
            }

            set.add(phone_book[i]);
        }

        return answer;
    }
}
```

HashSet을 사용했더라도 Set 전체를 반복하면 조회 이점을 얻지 못한다. `set.contains(candidate)`는 평균 O(1)이지만 `for (String x : set)`은 O(set.size())이다.

### H3 핵심 관찰

현재 전화번호를 Set 안의 모든 번호와 비교하지 않는다. 모든 전체 전화번호를 먼저 Set에 넣은 뒤, 현재 번호에서 가능한 올바른 접두어만 만들어 `contains`로 직접 조회한다.

### H3 안내 구현

```text
설명 후 구현 시간: 3분
추가 검색: 없음
알고리즘 힌트: H3
결과: 논리적으로 정답
등급 후보: D
D0 빈 화면 재구현: 대기
```

```java
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < phone_book.length; i++) {
            set.add(phone_book[i]);
        }

        for (int i = 0; i < phone_book.length; i++) {
            if (answer == false) {
                break;
            }

            int len = phone_book[i].length();

            for (int j = 0; j < len; j++) {
                if (set.contains(phone_book[i].substring(0, j))) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
```

이 구현은 맞지만 다음 두 부분을 정리할 수 있다.

- `j = 0`은 빈 문자열을 검사하므로 `j = 1`부터 시작한다.
- 접두어를 발견하면 `answer`를 바꾸고 나중에 반복문을 끝내기보다 곧바로 `return false`한다.

수정된 핵심 불변식은 다음과 같다.

```text
접두어 검사를 시작하기 전에 모든 전체 전화번호가 Set에 들어 있다.
현재 번호에 대해 지금까지 만든 모든 proper prefix가 Set에 있는지 확인했다.
```

HashSet-only 방식의 시간은 Java substring 생성과 해시 계산을 포함해 O(n × L²), 추가 공간은 O(n)이다. `L <= 20`이므로 실질적으로 선형에 가깝다.

---

## 다음 과제

### 전화번호 목록 H3 후 D0 재구현

```text
제한 시간: 20분
H3 설명과 현재 코드: 모두 닫기
검색: 금지
Arrays.sort: 사용 금지
Set 전체 순회: 사용 금지
통과 기준: 프로그래머스 정확성·효율성 전체 통과
```

코딩 전 확인:

```text
상태 / 자료구조:
모든 전체 전화번호를 저장한 HashSet

불변식:
접두어 검사 전에 모든 전체 번호가 Set에 있다.

시간 / 공간 복잡도:
시간 O(n × L²), 공간 O(n)

확인할 경계:
j는 1부터 len-1까지 / 전체 문자열은 자기 자신이므로 검사하지 않음
```
