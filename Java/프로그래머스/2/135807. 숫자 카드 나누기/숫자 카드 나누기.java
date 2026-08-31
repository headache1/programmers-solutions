class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int first = gcd(arrayA, arrayB);
        int second = gcd(arrayB, arrayA);
        System.out.println(first);
        System.out.println(second);
        return Math.max(first, second);
    }
    
    public int gcd(int[] a, int[] b){
        int check = a[0];
        for (int i = 1; i < a.length; i++){
            int first = a[i];
            int second = check;
            while (second != 0){
                int temp = first % second;
                first = second;
                second = temp;
            }
            
            check = first;
        }
        int check2 = 0;
        for (int i = 0; i < b.length; i++){
            if (b[i] % check == 0){
                check2 = 1;
            }
        }
        if (check2 == 0){
            return check;
        }
        else{
            return 0;
        }
    }
}