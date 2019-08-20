// problem link
// https://leetcode.com/problems/distribute-candies-to-people/

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        for(int i = 0; 0 < candies; i++){
            res[i % num_people] += Math.min(candies, i+1);
            candies -= (i+1);
        }
        return res;
    }
}