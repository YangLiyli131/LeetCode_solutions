// problem link
// https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int R = nums.length;
        int C = nums[0].length;
        if(R*C != r*c) return nums;
        int[] arr = new int[R*C];
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                arr[i * C + j] = nums[i][j];
            }
        }
        int[][] res = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                res[i][j] = arr[i * c + j];
            }
        }
        return res;
    }
}