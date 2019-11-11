// problem link
// https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        int n_row = matrix.length;
        int n_col = matrix[0].length;
        boolean fr = false, fc = false;
        for(int i = 0; i < n_row; i++){
            for(int j = 0; j < n_col; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < n_row; i++){
            for(int j = 1; j < n_col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr){
            for(int j = 0; j < n_col; j++) matrix[0][j] = 0;
        }
        if(fc){
            for(int j = 0; j < n_row; j++) matrix[j][0] = 0;
        }
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        int n_row = matrix.length;
        int n_col = matrix[0].length;
        // search the matrix to store the row and column index of 0
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                if(matrix[r][c] == 0){
                    hs1.add(r);
                    hs2.add(c);
                }
            }
        }
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                if(hs1.contains(r) || hs2.contains(c)) matrix[r][c] = 0;
            }
        }
    }
}