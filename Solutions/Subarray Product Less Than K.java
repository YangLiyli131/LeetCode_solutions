// problem link
// https://leetcode.com/problems/subarray-product-less-than-k/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int res = 0;
        int cur = 1;
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            cur = cur * nums[j];
            while(cur >= k){
                cur = cur / nums[i++];
            } 
            res += j - i + 1;
        }
        return res;
    }
}