// problem link
// https://leetcode.com/problems/shortest-completing-word/

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(char c : licensePlate.toCharArray()){
            if(isLetter(c)){
                c = Character.toLowerCase(c);
                hm1.put(c,hm1.getOrDefault(c,0)+1);
            }
        }
        String res = "";
        int minlen = Integer.MAX_VALUE;
        HashMap<Character,Integer> hm2;
        for(String s : words){
            boolean flag = true;
            char[] cc = s.toCharArray();
            hm2 = new HashMap<Character,Integer>();
            for(char x : cc){
                hm2.put(x, hm2.getOrDefault(x,0)+1);
            }
            for(char xx : hm1.keySet()){
                if(!hm2.containsKey(xx)) {flag = false; break;}
                if(hm2.get(xx) < hm1.get(xx)) {flag = false; break;}                
            }
            if(flag){
                if(minlen > s.length()){
                    res = s;
                    minlen = s.length();
                }
            }
        }
        return res;
    }
    private boolean isLetter(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) return true;
        else return false;
    }
}