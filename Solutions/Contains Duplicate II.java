// problem link
// https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            if(!hm.containsKey(x)) hm.put(x,i);
            else{
                int g = hm.get(x);
                int d = g > i? g-i : i-g;
                if(d <= k) return true;
                else hm.put(x,i);
            }
        }
        return false;
    }
}