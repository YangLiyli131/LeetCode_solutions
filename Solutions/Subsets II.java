// problem link
// https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    private void helper(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums, int id){
        res.add(new ArrayList<Integer>(temp));
        for(int i = id; i < nums.length; i++){
            if(i > id && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            helper(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}