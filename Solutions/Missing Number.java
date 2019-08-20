// problem link
// https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ss = (1+n)*n/2;
        int s = 0;
        for(int i : nums) s += i;
        return ss - s;
    }
}