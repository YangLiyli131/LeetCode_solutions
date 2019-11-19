// problem link
// https://leetcode.com/problems/surrounded-regions/

class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;
        int rows = board.length, cols = board[0].length;
        for(int i = 0; i < rows; i++){
            if(board[i][0] == 'O') dfs(board,i,0);
            if(board[i][cols-1] == 'O') dfs(board,i,cols-1);
        }
        for(int j = 0; j < cols; j++){
            if(board[0][j] == 'O') dfs(board,0, j);
            if(board[rows-1][j] == 'O') dfs(board,rows-1,j);
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == 'U') board[i][j] = 'O';
            }
        }
    }
    private void dfs(char[][] b, int i, int j){
        if(i < b.length && i >= 0 && j >= 0 && j < b[0].length && b[i][j] == 'O'){
            b[i][j] = 'U';
            dfs(b,i-1,j);
            dfs(b,i+1,j);
            dfs(b,i,j-1);
            dfs(b,i,j+1);
        }
    }
}