// problem link
// https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int l = 1;
        int r = x;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(m > x / m) r = m - 1;
            else l = m + 1;
        }
        return r;
    }
}