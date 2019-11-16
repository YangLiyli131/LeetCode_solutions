// problem link
// https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return res;
        int rows = matrix.length, cols = matrix[0].length;
        int up = 0, down = rows - 1, left = 0, right = cols - 1;
        while(res.size() < rows * cols){
            for(int j = left; j <= right && res.size() < rows * cols; j++){
                res.add(matrix[up][j]);
            }
            for(int i = up + 1; i <= down - 1 && res.size() < rows * cols; i++){
                res.add(matrix[i][right]);
            }
            for(int j = right; j >= left && res.size() < rows * cols; j--){
                res.add(matrix[down][j]);
            }
            for(int i = down - 1; i > up && res.size() < rows * cols; i--){
                res.add(matrix[i][left]);
            }
            left++; up++; down--; right--;
        }
        return res;
    }
}