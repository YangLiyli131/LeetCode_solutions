// problem link
// https://leetcode.com/problems/rectangle-overlap/

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int a1 = rec1[0], a2 = rec2[0];
        int b1 = rec1[1], b2 = rec2[1];
        int c1 = rec1[2], c2 = rec2[2];
        int d1 = rec1[3], d2 = rec2[3];
        return !((c2 <= a1) || (a2 >= c1) || (b2 >= d1) || (d2 <= b1));
    }
}