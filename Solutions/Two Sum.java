// problem link
// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                int x = hm.get(target - nums[i]);
                res[0] = Math.min(x,i);
                res[1] = Math.max(x,i);
            }else{
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}