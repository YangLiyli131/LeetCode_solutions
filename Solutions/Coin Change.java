// problem link
// https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 1) return 0;
        int[] dp = new int[amount+1];
        int sum = 0;
        while(++sum <= amount){
            int min = -1;
            for(int c : coins){
                if(sum >= c && dp[sum - c] != -1){
                    int t = dp[sum - c] + 1;
                    min = min < 0? t : (t < min? t : min);
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }
}