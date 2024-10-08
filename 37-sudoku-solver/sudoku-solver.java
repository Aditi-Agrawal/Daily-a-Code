class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);

    }

    private boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(canPut(i,j,board,c)){
                            board[i][j]=c;
                            if(solve(board)) return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean canPut(int row,int col,char[][] board,char c){
        for(int i=0;i<9;i++){
            //checking row
            if(board[i][col]==c) return false;

            if(board[row][i]==c) return false;

            if(board[3*(row/3) + i/3 ][3*(col/3) + i%3] == c) return false;
        }
        return true;
    }
}