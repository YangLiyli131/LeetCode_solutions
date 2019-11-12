// problem link
// https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= n+1; i++){
            dp[i] = Math.max(dp[i-2]+nums[i-2], dp[i-1]);
        }
        return dp[dp.length-1];
    }
}