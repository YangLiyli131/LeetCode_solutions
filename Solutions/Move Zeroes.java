// problem link
// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length < 2) return;
        int i = 0, j = 0;
        while(i < nums.length && nums[i] != 0) i++;
        while(j < nums.length && nums[j] != 0) j++;
        int t = 0;
        while(j < nums.length){
            if(nums[j] == 0) j++;
            else{
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }
        }
        return;
    }
}