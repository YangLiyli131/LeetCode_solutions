// problem link
// https://leetcode.com/problems/rotate-string/

class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
        return (A+A).contains(B);
    }
}