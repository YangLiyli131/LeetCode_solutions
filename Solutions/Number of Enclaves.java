// problem link
// https://leetcode.com/problems/number-of-enclaves/

class Solution {
    public int numEnclaves(int[][] A) {
        int res = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                if(i == 0 || j == 0 || i == A.length-1 || j == A[0].length-1) dfs(i, j, A);
            }
        }
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                if(A[i][j] == 1) res++;
            }
        }
        return res;
    }
    private void dfs(int i, int j, int[][] A){
        if(i >= 0 && j >= 0 && i < A.length && j < A[0].length && A[i][j] == 1){
            A[i][j] = 0;
            dfs(i-1,j,A);
            dfs(i+1,j,A);
            dfs(i,j+1,A);
            dfs(i,j-1,A);
        }
    }
}