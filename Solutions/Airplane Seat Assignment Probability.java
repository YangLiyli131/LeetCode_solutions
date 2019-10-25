// problem link
// https://leetcode.com/problems/airplane-seat-assignment-probability/

class Solution {
    public double nthPersonGetsNthSeat(int n) {
        
        //double[] dp = new double[n];
        //dp[0] = 1.0;
        //for(int i = 1; i < n; i++){
        //    dp[i] = 1.0/(i+1) + dp[i-1] * (i-1)/(i+1);
        //}
        //return dp[n-1];
        return n > 1? 0.5 : 1.0;
    }
}