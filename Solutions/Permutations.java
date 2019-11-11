// problem link
// https://leetcode.com/problems/permutations/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, nums, new ArrayList<>());
        return res;
    }
    private void helper(List<List<Integer>> res, int[] nums, ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<Integer>(temp));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                //for(int x : temp) {System.out.print(x + " ");}
                //System.out.println();
                helper(res, nums, temp);
                //for(int x : temp) {System.out.print(x + " ");}
                //System.out.println();
                temp.remove(temp.size()-1);
            }
        }
    }
}