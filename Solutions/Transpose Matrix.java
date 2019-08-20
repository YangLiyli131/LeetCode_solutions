// problem link
// https://leetcode.com/problems/transpose-matrix/

class Solution {
    public int[][] transpose(int[][] A) {
        int c = A.length;
        int r = A[0].length;
        int[][] res = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                res[i][j] = A[j][i];
            }
        }
        return res;
    }
}