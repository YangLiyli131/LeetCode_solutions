// problem link
// https://leetcode.com/problems/isomorphic-strings/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char x = t.charAt(i);
            char y = s.charAt(i);
            if(!hm.containsKey(x)){
                if(hm.values().contains(y)) return false;
                hm.put(x,y);
            }else{
                if(y != hm.get(x)) return false;
            }
        }
        return true;
    }
}