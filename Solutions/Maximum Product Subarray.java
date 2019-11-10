// problem link
// https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        int[] max_v = new int[nums.length];
        int[] min_v = new int[nums.length];
        max_v[0] = nums[0];
        min_v[0] = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > 0){
                max_v[i] = Math.max(nums[i], max_v[i-1] * nums[i]);
                min_v[i] = Math.min(nums[i], min_v[i-1] * nums[i]);
            }else{
                max_v[i] = Math.max(nums[i], min_v[i-1] * nums[i]);
                min_v[i] = Math.min(nums[i], max_v[i-1] * nums[i]);
            }
            res = res < max_v[i]? max_v[i] : res;  
        }
        return res;
    }
}