// problem link
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int id = 1;
        int flag = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != flag){
                nums[id++] = nums[i];
                flag = nums[i];
            }
        }
        return id;
    }
}