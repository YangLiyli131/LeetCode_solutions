// problem link
// https://leetcode.com/problems/range-sum-query-immutable/

class NumArray {
    int[] dp;
    public NumArray(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        this.dp = nums;
    }
    
    public int sumRange(int i, int j) {
        if(i == 0) return dp[j];
        else return dp[j] - dp[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */