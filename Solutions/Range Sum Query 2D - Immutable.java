// problem link
// https://leetcode.com/problems/range-sum-query-2d-immutable/

class NumMatrix {
    int[][] dp;
    public NumMatrix(int[][] matrix) {
        this.dp = matrix;
        int row = dp.length;
        for(int r = 1; r < row; r++){
            for(int c = 0; c < matrix[r].length; c++){
                dp[r][c] += dp[r-1][c];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == row2 && col1 == col2){
            return row1 == 0? dp[row1][col1] : dp[row1][col1] - dp[row1-1][col1];
        }        
        int t = 0, tt = 0;
        for(int s = col1; s <= col2; s++){
            if(row1 != 0) t += dp[row1-1][s];
            tt += dp[row2][s];
        }
        return tt - t;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */