// problem link
// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > nums[end]){
                // left part sorted
                if(nums[start] <= target && nums[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                // right part sorted
                if(nums[end] >= target && nums[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}