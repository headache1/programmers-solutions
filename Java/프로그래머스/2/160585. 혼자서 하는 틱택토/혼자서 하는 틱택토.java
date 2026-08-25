class Solution {  
    public int solution(String[] board) {  
        int answer = 1;  
        int count_o = 0;  
        int count_x = 0;  
        int win_o = 0;
        int win_x = 0;

        for (int i = 0; i < board.length; i++){  

            // 가로 승리
            if (board[i].equals("XXX")){  
                win_x = 1;
            }

            if (board[i].equals("OOO")){  
                win_o = 1;
            }
              
            // 왼쪽 위 -> 오른쪽 아래 대각선
            if (i == 0 
                && board[i].charAt(0) == 'X' 
                && board[i+1].charAt(1) == 'X' 
                && board[i+2].charAt(2) == 'X'){  
                win_x = 1;
            }

            if (i == 0 
                && board[i].charAt(0) == 'O' 
                && board[i+1].charAt(1) == 'O' 
                && board[i+2].charAt(2) == 'O'){  
                win_o = 1;
            }

            // 오른쪽 위 -> 왼쪽 아래 대각선
            if (i == 0 
                && board[i].charAt(2) == 'X' 
                && board[i+1].charAt(1) == 'X' 
                && board[i+2].charAt(0) == 'X'){  
                win_x = 1;
            }

            if (i == 0 
                && board[i].charAt(2) == 'O' 
                && board[i+1].charAt(1) == 'O' 
                && board[i+2].charAt(0) == 'O'){  
                win_o = 1;
            }

            // 세로 승리
            for (int j = 0; j < 3; j++){  
                if (i == 0 
                    && board[i].charAt(j) == 'X' 
                    && board[i+1].charAt(j) == 'X' 
                    && board[i+2].charAt(j) == 'X'){  
                    win_x = 1;
                }

                if (i == 0 
                    && board[i].charAt(j) == 'O' 
                    && board[i+1].charAt(j) == 'O' 
                    && board[i+2].charAt(j) == 'O'){  
                    win_o = 1;
                }
            }  

            // O, X 개수 세기
            for (char x : board[i].toCharArray()){  
                if (x == 'O'){  
                    count_o++;  
                }  

                if (x == 'X'){  
                    count_x++;  
                }  
            }  
        }  
          
        if ((count_o < count_x) || (count_o > count_x + 1)){  
            answer = 0;  
        }
        
        if (win_o == 1 && count_o != count_x + 1) {
            answer = 0;
        }

        if (win_x == 1 && count_o != count_x) {
            answer = 0;
        }

        return answer;  
    }  
}