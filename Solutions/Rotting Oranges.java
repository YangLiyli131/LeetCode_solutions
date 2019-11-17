// problem link
// https://leetcode.com/problems/rotting-oranges/

class Solution {
    public int orangesRotting(int[][] grid) {
        int index = 0;
        int[][] visited;
        int row = grid.length, col = grid[0].length;
        boolean changed = true;
        while(changed){
            changed = false;            
            visited = new int[row][col];
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    if(grid[i][j] != 2) continue;
                    else{
                        if(visited[i][j] == 1) continue;
                        visited[i][j] = 1;
                        if(i-1 >= 0 && grid[i-1][j] == 1 && visited[i-1][j] != 1) {grid[i-1][j] = 2; changed = true; visited[i-1][j] = 1;}
                        if(i+1 < row && grid[i+1][j] == 1 && visited[i+1][j] != 1) {grid[i+1][j] = 2; changed = true; visited[i+1][j] = 1;}
                        if(j-1 >= 0 && grid[i][j-1] == 1 && visited[i][j-1] != 1) {grid[i][j-1] = 2; changed = true; visited[i][j-1] = 1;}
                        if(j+1 < col && grid[i][j+1] == 1 && visited[i][j+1] != 1) {grid[i][j+1] = 2; changed = true; visited[i][j+1] = 1;}                
                    }
                }
            }
            if(changed) index++;
            else break;
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1) return -1;
            }
        }
        return index;
    }
}