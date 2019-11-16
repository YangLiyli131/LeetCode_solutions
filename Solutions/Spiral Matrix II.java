// problem link
// https://leetcode.com/problems/spiral-matrix-ii/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0, right = n-1, up = 0, down = n-1;
        int x = 1;
        while(x <= n*n){
            for(int j = left; j <= right && x <= n*n; j++){
                res[up][j] = x++;
            }
            for(int i = up+1; i <= down-1 && x <= n*n; i++){
                res[i][right] = x++;
            }
            for(int j = right; j >= left && x <= n*n; j--){
                res[down][j] = x++;
            }
            for(int i = down-1; i > up && x <= n*n; i--){
                res[i][left] = x++;
            }
            left++; right--; up++; down--;
        }
        return res;
    }
}