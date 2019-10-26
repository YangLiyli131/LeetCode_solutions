// problem link
// https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        // first flip along the main diagonal
        // then swap columns
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i = 0, j = matrix.length-1; i < j;i++,j--){
            for(int r = 0; r < matrix.length; r++){
                int temp = matrix[r][i];
                matrix[r][i] = matrix[r][j];
                matrix[r][j] = temp;
            }
        }
        
    }
}