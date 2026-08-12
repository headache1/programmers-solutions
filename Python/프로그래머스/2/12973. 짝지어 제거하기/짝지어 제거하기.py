def solution(s):
    answer = -1
    stack = []
    for i in s :
        if not stack or stack[-1] != i :
            stack.append(i)
        elif stack[-1] == i :
            stack.pop(-1)
    
    if not stack :
        answer = 1
    else :
        answer = 0

    return answer