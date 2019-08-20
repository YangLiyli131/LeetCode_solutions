// problem link
// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

class Solution {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(char c : chars.toCharArray()){
            if(!hm1.containsKey(c)){
                hm1.put(c,1);
            }else{
                hm1.put(c, hm1.get(c)+1);
            }
        }
        HashMap<Character,Integer> hm11 = new HashMap<>();
        for(String s : words){
            int flag = 1;
            for(char c : s.toCharArray()){
                if(!hm11.containsKey(c)){
                    hm11.put(c,1);
                }else{
                    hm11.put(c, hm11.get(c)+1);
                }
            }
            for(char c : hm11.keySet()){
                if(!hm1.containsKey(c)){
                    flag = 0;
                    break;
                }
                if(hm11.get(c) > hm1.get(c)){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) res += s.length();
            hm11.clear();
        }
        return res;
    }
}