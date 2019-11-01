// problem link
// https://leetcode.com/problems/island-perimeter/

class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int total = 0;
        int nei = 0;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    total++;    
                    if(i >= 1 && grid[i-1][j] == 1) nei++;
                    if(j >= 1 && grid[i][j-1] == 1) nei++;
                    if(i < grid.length-1 && grid[i+1][j] == 1) nei++;
                    if(j < grid[0].length-1 && grid[i][j+1] == 1) nei++;
                }
            }
        }
        return 4 * total - nei;
    }
}