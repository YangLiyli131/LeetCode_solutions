// problem link
// https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int N) {
        if(N == 0) return 1;
        else return helper(N) - N;
    }
    private int helper(int n){
        int res = 0;
        int id = 0;
        while(n != 0){
            n /= 2;
            res += Math.pow(2,id);
            id++;
        }
        return res;
    }
}