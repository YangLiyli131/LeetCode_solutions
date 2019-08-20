// problem link
// https://leetcode.com/problems/binary-number-with-alternating-bits/

class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean flag = true;
        int pre = n % 2;
        n /= 2;
        while(n != 0){
            int t = n % 2;
            if(t == pre){
                flag = false;
                break;
            }else{
                pre = t;
                n /= 2;
            }
        }
        return flag;
    }
}