// problem link
// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1; i >= 0; i--){
            int cur = digits[i];
            int s = cur + carry;
            if(s < 10){
                digits[i] = s;
                return digits;
            }else{
                digits[i] = s % 10;
            }
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        for(int i = 1; i < res.length; i++){
            res[i] = digits[i-1];
        }
        return res;
    }
}