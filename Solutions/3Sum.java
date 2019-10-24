// problem link
// https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int l,r;
        for(int i = 0; i < nums.length - 2; i++){
            l = i + 1;
            r = nums.length - 1;
            while(l < r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[l]);
                    t.add(nums[r]);
                    if(!res.contains(t)) res.add(t);
                    l++;
                    r--;
                }else if(nums[i] + nums[l] + nums[r] < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
}