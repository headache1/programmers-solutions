class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] arr = new char[skill.length()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = skill.charAt(i);
        }
        
        for (int i = 0; i < skill_trees.length; i++){
            int place = 0;
            int check = 0;
            for (char x : skill_trees[i].toCharArray()){
                if (place < arr.length && x == arr[place]){
                    place += 1;
                }
                else if (place < arr.length-1 && x != arr[place]){
                    for (int j = place+1; j < arr.length;j++){
                        if (x == arr[j]){
                            check = -1;
                        }
                    }
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
반환값 : 이거 가능한 스킬트리임? 수

int 가능

풀이예상1:
a. skill을 배열로 변환한다.
b. skilltree안에 있는 원소들을 하나씩 검증한다. 만일 arr[0]

시간복잡도 : n^3

*/