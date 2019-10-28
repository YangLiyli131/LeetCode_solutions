// problem link
// hhttps://leetcode.com/problems/check-if-it-is-a-straight-line/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int base_x = coordinates[1][0] - coordinates[0][0];
        int base_y = coordinates[1][1] - coordinates[0][1];
        for(int i = 2; i < coordinates.length; i++){
            int x = coordinates[i][0] - coordinates[0][0];
            int y = coordinates[i][1] - coordinates[0][1];
            if(x * base_y != y * base_x) return false;
        }
        return true;
    }
}