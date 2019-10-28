// problem link
// https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == 'R') count++;
            else count--;
            if(count == 0) res++;
        }
        return res;
    }
}