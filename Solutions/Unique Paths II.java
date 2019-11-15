// problem link
// https://leetcode.com/problems/unique-paths-ii/

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length, c = obstacleGrid[0].length; 
        
        if(obstacleGrid[0][0] == 1) return 0;
        
        for(int i = 0; i < r; i++){
            if(obstacleGrid[i][0] == 0) obstacleGrid[i][0] = 1;
            else{
                for(int x = i; x < r; x++) obstacleGrid[x][0] = 0;
                break;
            }
        }
        for(int j = 1; j < c; j++){
            if(obstacleGrid[0][j] == 0) obstacleGrid[0][j] = 1;
            else{
                for(int x = j; x < c; x++) obstacleGrid[0][x] = 0;
                break;
            }
        }
        for(int i = 1; i < r; i++){
            for(int j = 1; j < c; j++){
                if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;
                else obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
            }
        }
        return obstacleGrid[r-1][c-1];
    }
}