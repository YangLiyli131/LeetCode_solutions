// problem link
// https://leetcode.com/problems/array-partition-i/

class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2){
            res += nums[i];
        }
        return res;
    }
}