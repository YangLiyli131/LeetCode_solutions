// problem link
// https://leetcode.com/problems/shift-2d-grid/

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(grid == null || grid.length == 0) return res;
        int row = grid.length, col = grid[0].length;
        while(k-- != 0){
            int[] lastCol = new int[row+1];
            // extract last column
            for(int i = 0; i < row; i++) lastCol[i+1] = grid[i][col-1];
            lastCol[0] = lastCol[row]; // move the last item to the first place
            // shift right one step
            for(int i = col-1; i >= 1; i--){
                for(int r = 0; r < row; r++){
                    grid[r][i] = grid[r][i-1];
                }
            }
            for(int r = 0; r < row; r++){
                grid[r][0] = lastCol[r];
            }
        }
        for(int r = 0; r < row; r++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < col; j++){
                temp.add(grid[r][j]);
            }
            res.add(temp);
        }
        return res;
    }
}