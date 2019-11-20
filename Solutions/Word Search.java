// problem link
// https://leetcode.com/problems/word-search/

class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0) return false;
        if(word == null || word.length() == 0) return false;
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(dfs(board, visited, word, r,c,0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, boolean[][] visited, String word, int r, int c, int wi){
        if(r < 0 || r > board.length-1 || c < 0 || c > board[0].length-1) return false;
        if(!visited[r][c] && board[r][c] == word.charAt(wi)){
            if(wi == word.length()-1) return true;
            visited[r][c] = true;
            boolean up = dfs(board, visited, word, r-1, c, wi+1);
            boolean down = dfs(board, visited, word, r+1, c, wi+1);
            boolean left = dfs(board, visited, word, r, c-1, wi+1);
            boolean right = dfs(board, visited, word, r, c+1, wi+1);
            visited[r][c] = up || down || left || right;
            return up || down || left || right;
        }
        return false;
    }
}