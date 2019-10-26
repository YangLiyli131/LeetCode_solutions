// problem link
// https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        
        int t = k % nums.length;
        /*
        while(t > 0){
            int temp = nums[nums.length-1];// every time the tail is removed
            for(int i = nums.length-1; i > 0; i--){
                nums[i] = nums[i-1];
            }
            t--;
            nums[0] = temp;
        }
        */
        /*
        int[] newarr = new int[2*nums.length];
        for(int i = 0; i < nums.length; i++){
            newarr[i] = nums[i];
            newarr[i+nums.length] = nums[i];
        }
        int id = 0;
        for(int i = nums.length-t; i < nums.length-t+nums.length; i++){
            nums[id++] = newarr[i];
        }
        */
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, t-1);
        reverse(nums, t, nums.length-1);
    }
    private void reverse(int[] n, int s, int e){
        while(s < e){
            int temp = n[s];
            n[s] = n[e];
            n[e] = temp;
            s++;
            e--;
        }
    }
}