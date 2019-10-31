// problem link
// https://leetcode.com/problems/play-with-chips/

class Solution {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0, even = 0;
        for(int i : chips){
            if(i % 2 == 0) even++;
            else odd++;
        }
        return Math.min(odd,even);
    }
}