// problem link
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0; i < indices.length; i++){
            int a = indices[i][0];
            int b = indices[i][1];
            row[a] += 1;
            col[b] += 1;
        }
        int[][] x = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                x[i][j] += row[i];
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                x[j][i] += col[i];
            }
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(x[i][j] % 2 == 1) res++;
            }
        }
        return res;
    }
}