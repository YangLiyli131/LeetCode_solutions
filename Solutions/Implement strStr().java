// problem link
// https://leetcode.com/problems/implement-strstr/

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
        int res = -1;
        int len = needle.length();
        for(int i = 0; i <= haystack.length() - len; i++){
            if(haystack.charAt(i) != needle.charAt(0)) continue;
            if(haystack.substring(i,i+len).equals(needle)) return i;
        }
        return res;
    }
}