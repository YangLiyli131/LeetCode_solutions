// problem link
// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        for(char c : t.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);
            }else{
                return false;
            }
        }
        for(int i : hm.values()){
            if(i != 0) return false;
        }
        return true;
    }
}