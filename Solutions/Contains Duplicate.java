// problem link
// https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        if(nums.length == 1) return false;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(hs.contains(i)) return true;
            else hs.add(i);
        }
        return false;
    }
}