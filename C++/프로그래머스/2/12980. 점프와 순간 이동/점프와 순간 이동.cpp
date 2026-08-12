#include <iostream>
using namespace std;

int solution(int n)
{
    int ans = 0;
    
    while (n != 0){
        if (n%2==0){
            n/=2;
        }
        else{
            n-=1;
            ans +=1;
        }
    }

    return ans;
}

/*
반환값 : 건전지 사용량을 가장 적게!

숫자 방식 : 10억이라도 int

풀이 방식 : 그냥 나누기 2 하다가 홀수면 -1 하면 될 듯? -1한 횟수가 정답

*/