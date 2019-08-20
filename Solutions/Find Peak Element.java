// problem link
// https://leetcode.com/problems/find-peak-element/

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        for(int a = 0, b = nums.length-1; a <= b; ){
            if(a == 0 && nums[a] > nums[a+1]) return a;
            else if(b == nums.length-1 && nums[b] > nums[b-1]) return b;
            else if(a!= 0 && nums[a] > nums[a-1] && nums[a] > nums[a+1]) return a;
            else if(b != nums.length-1 && nums[b] > nums[b+1] && nums[b] > nums[b-1]) return b;
            else{
                a++;
                b--;
            }
        }
        return 0;
    }
}