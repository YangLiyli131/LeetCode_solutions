// problem link
// https://leetcode.com/problems/binary-gap/

class Solution {
    public int binaryGap(int N) {
        int res = 0;
        int id = 0, pre = 0, cur = 0;
        int first = 1;
        while(N != 0){
            int t = N%2;
            if(t == 1){
                if(first == 1){
                    pre = id;
                    first = 0;
                }else{
                    cur = id;
                    res = Math.max(res, cur - pre);
                    pre = cur;
                }
            }
            id++;
            N /= 2;
        }
        return res;
    }
}