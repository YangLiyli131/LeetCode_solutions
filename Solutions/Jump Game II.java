// problem link
// https://leetcode.com/problems/jump-game-ii/

class Solution {
    public int jump(int[] nums) {
        //https://www.cnblogs.com/lichen782/p/leetcode_Jump_Game_II.html
        int max = 0;
        int res = 0;
        int cur = 0;
        for(int i = 0; i < nums.length; i++){
            // when i < cur, it means this position can be reached without another step
            if(i > cur){
                res++;
                cur = max;
            }
            max = Math.max(max, i + nums[i]);
        }
        return res;
    }
}