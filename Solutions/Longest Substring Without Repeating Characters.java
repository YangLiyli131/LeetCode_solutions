// problem link
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int res = 1;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> hs = new HashSet<>();
            char a = s.charAt(i);
            hs.add(a);
            for(int j = i + 1; j < s.length(); j++){
                if(!hs.contains(s.charAt(j))){
                    hs.add(s.charAt(j));
                    res = hs.size() > res? hs.size() : res;
                }else{
                    break;
                }
            }
        }
        return res;
    }
}