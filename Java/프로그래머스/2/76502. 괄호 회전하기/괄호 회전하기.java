import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if (x=='[' || x== '(' || x== '{'){
                ArrayDeque <Character> stack = new ArrayDeque<>();
                int count = 0;
                for (int j = i; j < s.length()+i;j++){
                    int place = j % s.length();
                    char y = s.charAt(place);
                    
                    if (y=='['){
                        stack.push(y);
                        count++;
                    }
                    if (y=='{'){
                        stack.push(y);
                        count++;
                    }
                    if (y == '('){
                        stack.push(y);
                        count++;
                    }
                    if (y==']'){
                        if (!stack.isEmpty() && stack.peek() == '['){
                            stack.pop();
                            count++;
                        }
                        else{
                            break;
                        }
                    }
                    if (y=='}'){
                        if (!stack.isEmpty() && stack.peek() == '{'){
                            stack.pop();
                            count++;
                        }
                        else{
                            break;
                        }
                    }
                    if (y==')'){
                        if (!stack.isEmpty() && stack.peek() == '('){
                            stack.pop();
                            count++;
                        }
                        else{
                            break;
                        }
                    }
                        
                }
                
                if (count == s.length() && stack.isEmpty()){
                    answer+=1;
                }
            }
        }
        return answer;
    }
}