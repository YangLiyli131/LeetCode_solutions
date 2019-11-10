// problem link
// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int water = 0;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            water = Math.max(water, h * (right - left));
            while(left < right && height[left] <= h) left++;
            while(left < right && height[right] <= h) right--;
        }
        return water;
    }
}