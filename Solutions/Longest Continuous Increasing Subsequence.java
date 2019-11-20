// problem link
// https://leetcode.com/problems/longest-continuous-increasing-subsequence/

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length < 1) return 0;
        if(nums.length == 1) return 1;
        int res = 0;
        int i = 0, j = 1;
        while(j < nums.length){
            if(j > 0 && nums[j] <= nums[j-1]) i = j;
            int d = j - i + 1;
            res = Math.max(d,res);
            j++;
        }
        return res;
    }
}