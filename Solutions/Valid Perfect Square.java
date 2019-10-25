// problem link
// https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        int x = (int)Math.sqrt(num);
        return num == x*x;
    }
}