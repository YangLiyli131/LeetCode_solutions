// problem link
// https://leetcode.com/problems/single-element-in-a-sorted-array/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        while(a+1 < nums.length){
            if(nums[a] != nums[a+1]) return nums[a];
            else a += 2;
        }
        return nums[nums.length-1];
    }
}