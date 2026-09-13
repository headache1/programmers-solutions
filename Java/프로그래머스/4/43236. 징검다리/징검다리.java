import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;

        Arrays.sort(rocks);

        int left = 1;
        int right = distance;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            int count = 0;
            int prev = 0;

            for (int i = 0; i < rocks.length; i++) {
                if (rocks[i] - prev < mid) {
                    count++;
                } else {
                    prev = rocks[i];
                }
            }
            if (distance - prev < mid){
                count++;
            }
            if (count <= n){
                left = mid+1;
            }
            else if (count > n){
                right = mid - 1;
            }
        }
        //System.out.println(left + " "+ right + " " + mid);

        return right;
    }
}