// problem link
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        for(int i = 0; i < ss.length; i++){
            ss[i] = new StringBuilder(ss[i]).reverse().toString();
        }
        StringBuilder res = new StringBuilder();
        for(String g : ss) res.append(g + " ");
        return res.toString().trim();
    }
}