class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        int bin1 = 0;
        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1'){
                bin1 += 1;
            }
        }
        int bin2 = 0;
        int n2 = n;
        while (bin1 != bin2){
            bin2 = 0;
            n2 += 1;
            String binary2 = Integer.toBinaryString(n2);
            for (int i = 0; i < binary2.length(); i++){
                if (binary2.charAt(i) == '1'){
                    bin2 += 1;
                }
            }
            if (bin1 == bin2){
                answer = n2;
            }
        }
        return answer;
    }
}