// problem link
// https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {
	// the results can only be the product of the top 3 largest numbers
	//or the product of the top 2 smallest numbers and the largest number
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        return Math.max(nums[0] * nums[1] * nums[n], nums[n] * nums[n-1] * nums[n-2]);
    }
}