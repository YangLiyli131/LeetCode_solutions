// problem link
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[end]){
                // right part sorted
                // min value at this point or left
                end = mid;
            }else{
                // left part sorted
                // min value at right
                start = mid + 1;
            }
        }
        return nums[start];
    }
}