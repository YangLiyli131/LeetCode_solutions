// problem link
// https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String lw = word.toLowerCase();
        if(word.equals(up)) return true;
        if(word.equals(lw)) return true;
        char c = word.charAt(0);
        String w2 = word.substring(1,word.length());
        if((c >= 'A' & c <= 'Z') & w2.equals(w2.toLowerCase())) return true;
        return false;
    }
}