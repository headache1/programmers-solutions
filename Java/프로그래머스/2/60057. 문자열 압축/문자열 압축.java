class Solution {
    public int solution(String s) {
        int answer = 0;
        int max_length = s.length()/2;
        
        int min = s.length();
        for (int i = 1; i <=max_length; i++){
            int count = 1;
            int num = 0;
            for (int j = 0; j < s.length();j++){
                if (j+i+i <= s.length() && s.substring(j,j+i).equals(s.substring(j+i,j+i+i))){
                    count++;
                    j = j+i-1;
                }
                else{
                    if ((s.length()- j) < i){
                        num+=s.length()-j;
                    }
                    else{
                        num+=i;
                    }
                    j = j+i-1;
                    if (count > 1){
                        String coun = Integer.toString(count);
                        num += coun.length();
                        count = 1;
                    }
                }
            }
            
            if (min > num){
                min = num;
            }
            
        }
        return min;
    }
}