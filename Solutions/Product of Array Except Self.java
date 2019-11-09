// problem link
// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        int n = nums.length;
        
        for(int i = 1; i < n; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i = n-1; i >= 0; i--){
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] A = new int[nums.length];
        A[0] = 1;
        for(int i = 1; i < nums.length; i++){
            A[i] = A[i-1] * nums[i-1];
        }        
        int[] B = new int[nums.length];
        B[nums.length-1] = 1;
        for(int i = nums.length-2; i >= 0; i--){
            B[i] = B[i+1] * nums[i+1];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = A[i] * B[i];
        }
        return res;
    }
}