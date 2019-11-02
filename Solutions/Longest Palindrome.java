// problem link
// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int res = 0;
        int f = 0;
        for(int i : hm.values()){
            if(i % 2 == 0) res += i;
            else{
                res += i - 1;
                f = 1;
            }
        }
        return res+f;
    }
}