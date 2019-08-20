// problem link
// https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1 && nums[0] != target) return -1;
        if(nums.length == 1 && nums[0] == target) return 0;
        int a = 0;
        int b = nums.length-1;
        int m = (a+b)/2;
        while(a <= b){
            if(nums[m] < target) a = m + 1;
            else if(nums[m] > target) b = m - 1;
            else return m;
            m = (a+ b) / 2;
        }
        return -1;
    }
}