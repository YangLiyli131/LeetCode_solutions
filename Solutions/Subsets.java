// problem link
// https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    private void helper(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums, int id){
        res.add(new ArrayList<Integer>(temp));
        for(int i = id; i < nums.length; i++){
            temp.add(nums[i]);
            helper(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}