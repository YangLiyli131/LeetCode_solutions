// problem link
// https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int row = matrix.length-1;
        for(int i = 0; i < matrix.length-1; i++){
            if(matrix[i][0] == target || matrix[i+1][0] == target) return true;
            if(matrix[i][0] < target && matrix[i+1][0] > target){
                // target is in range of row i
                row = i;
                break;
            }
        }
        int[] arr = matrix[row];
        return helper(arr,target);
    }
    private boolean helper(int[] arr, int t){
        int i = 0, j = arr.length-1;
        while(i <= j){
            int m = i + (j-i)/2;
            if(arr[m] == t) return true;
            else if(arr[m] < t) i = m + 1;
            else j = m - 1;
        }
        return false;
    }
}