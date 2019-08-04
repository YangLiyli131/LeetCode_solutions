// problem link
// https://leetcode.com/problems/max-increase-to-keep-city-skyline/

/*
Medium difficulty, but easy to implement
First iteration, find the skyline from top/bottom and from left/right
Second iteration, check each element in the matrix,
see if it can be increased without disturbing the skylines from BOTH directions
*/

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] top = new int[grid[0].length];
        int[] lr = new int[grid.length];
        for(int i = 0; i < top.length; i++){
            int x = 0;
            for(int j = 0; j < grid.length; j++){
                if(x < grid[j][i]) x = grid[j][i];
            }
            top[i] = x;
        }
        for(int i = 0; i < lr.length; i++){
            int x = 0;
            for(int j = 0; j < top.length; j++){
                if(x < grid[i][j]) x = grid[i][j];
            }
            lr[i] = x;
        }
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                res += Math.min(lr[i], top[j]) - grid[i][j];
            }
        }
        return res;
    }
}