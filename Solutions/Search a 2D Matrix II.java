// problem link
// https://leetcode.com/problems/search-a-2d-matrix-ii/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int startrow = 0, startcol = matrix[0].length-1;
        while(startcol >= 0 && startrow < matrix.length){
            if(matrix[startrow][startcol] == target) return true;
            else if(matrix[startrow][startcol] > target) startcol--;
            else startrow++;
        }
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int len = matrix[0].length;
        int[] t = new int[len];
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == target || matrix[i][len-1] == target) return true;
            if(matrix[i][0] < target || matrix[i][len-1] > target){
                // target can be in this row
                t = matrix[i];
                if(helper(t,target)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean helper(int[] arr, int t){
        int i = 0, j = arr.length-1;
        while(i <= j){
            int m = i + (j-i)/2;
            if(arr[m] == t) return true;
            else if(arr[m] > t) j = m-1;
            else i = m+1;
        }
        return false;
    }
}