// problem link
// https://leetcode.com/problems/distribute-candies/

class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : candies) hs.add(i);
        return Math.min(candies.length/2, hs.size());
    }
}