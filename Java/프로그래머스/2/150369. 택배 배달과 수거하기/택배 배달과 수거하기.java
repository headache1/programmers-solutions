import java.util.Arrays;

class Solution {
    int dIndex;
    int pIndex;
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        dIndex = n - 1;
        pIndex = n - 1;
        long answer = 0;
        int check = 1;
        int place = 0;
        int temp = 1;
        while (temp != 0){
            temp = Math.max(deliver(cap, n, deliveries), pickup(cap, n, pickups));
            answer+= temp;
            place++;
        }
        return answer;

        
    }
    public int deliver(int cap, int n, int[] deliveries){
        int sum = 0;
        int distance = 0;
        for (int i = dIndex; i>=0; i--){
            if (sum == 0 && deliveries[i] != 0){
                distance = (i+1) * 2;
                sum = 1;
            }
            
            if (cap - deliveries[i] >= 0){
                cap -= deliveries[i];
                deliveries[i] = 0;
            }
            else if(cap - deliveries[i] < 0){
                deliveries[i] -= cap;
                dIndex = i;
                break;
            }
                
        }
        return distance;
    }
    
    public int pickup(int cap, int n, int[] pickups){
        int sum = 0;
        int distance = 0;
        for (int i = pIndex; i>=0; i--){
            if (sum == 0 && pickups[i] != 0){
                distance = (i+1) * 2;
                sum = 1;
            }
            
            if (cap - pickups[i] >= 0){
                cap -= pickups[i];
                pickups[i] = 0;
            }
            else if(cap - pickups[i] < 0){
                pickups[i] -= cap;
                pIndex = i;
                break;
            }
                
        }
        return distance;
    }
}