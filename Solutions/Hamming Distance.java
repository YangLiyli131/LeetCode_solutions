// problem link
// https://leetcode.com/problems/hamming-distance/

class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        while(x != 0 || y != 0){
            int a = x % 2; //System.out.println(a);
            int b = y % 2; //System.out.println(b);
            res = a == b? res : (res + 1);
            x /= 2;
            y /= 2;
        }
        return res;
    }
}