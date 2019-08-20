// problem link
// https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        String[] ss = s.split(" ");
        if(ss.length == 0) return 0;
        String t = ss[ss.length-1];
        return t.length();
    }
}