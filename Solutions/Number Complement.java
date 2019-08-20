// problem link
// https://leetcode.com/problems/number-complement/

class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;
        int p = 0;
        int res = 0;
        while(num != 0){
            int t = num % 2;
            int pp = t == 1? 0 : 1;
            res += pp * ((int)Math.pow(2,p));
            num /= 2;
            p++;
        }
        return res;
    }
}