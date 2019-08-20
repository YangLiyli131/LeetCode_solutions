// problem link
// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int cur = 0;
        for(int i : nums){
            cur += i;
            if(cur > res) res = cur;
            if(cur < 0) cur = 0;
        }
        return res;
    }
}