// problem link
// https://leetcode.com/problems/max-area-of-island/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int Row = grid.length, Col = grid[0].length;
        for(int i = 0; i < Row; i++){
            for(int j = 0; j < Col; j++){
                if(grid[i][j] == 1) res = Math.max(res, dfs(i,j,grid));
            }
        }
        return res;
        
    }
    private int dfs(int i, int j, int[][] grid){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + dfs(i-1, j, grid) + dfs(i+1, j, grid) + dfs(i, j-1, grid) + dfs(i, j+1, grid);
        }
        return 0;
    }
}