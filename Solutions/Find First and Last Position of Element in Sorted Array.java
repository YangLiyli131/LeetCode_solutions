// problem link
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        int[] res = new int[2];
        int l = 0, r = nums.length-1;
        while(l < r){
            int m = l + (r-l) / 2;
            if(nums[m] < target) l = m + 1;
            else r = m;
        }
        if(nums[l] != target) return new int[]{-1,-1};
        res[0] = l;
        
        l = 0;
        r = nums.length-1;
        while(l < r){
            int m = (r + l) / 2 + 1;
            if(nums[m] > target) r = m-1;
            else l = m;
        }
        res[1] = l;
        return res;
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> tt = new ArrayList<>();
        helper(tt, 0, nums.length-1, nums, target);
        if(tt.size() == 0) return new int[]{-1,-1};
        int mini = Integer.MAX_VALUE, maxx = Integer.MIN_VALUE;
        for(int i : tt){
            if(i < mini) mini = i;
            if(i > maxx) maxx = i;
        }
        return new int[]{mini, maxx};
    }
    private void helper(List<Integer> temp, int a, int b, int[] nums, int t){
        if(a < 0 || b >= nums.length || a > b) return;
        int m = a + (b-a) / 2;
        if(nums[m] > t){
            helper(temp, a, m-1, nums, t);
        }else if(nums[m] < t){
            helper(temp, m+1, b, nums, t);
        }else{
            temp.add(m);
            helper(temp, a, m-1, nums, t);
            helper(temp, m+1, b, nums, t);
        }
    }
}