// problem link
// https://leetcode.com/problems/verifying-an-alien-dictionary/

class Solution {
    int[] map = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < order.length(); i++){
            map[order.charAt(i) - 'a'] = i;
        }
        for(int i = 1; i < words.length; i++){
            if(helper(words[i-1], words[i])) return false;
        }
        return true;
    }
    private boolean helper(String a, String b){
        int na = a.length(), nb = b.length();
        for(int i = 0; i < na && i < nb; i++){
            if(a.charAt(i) != b.charAt(i)){
                return map[a.charAt(i) - 'a'] > map[b.charAt(i) - 'a'];
            }
        }
        return na > nb;
    }
}

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1) return true;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < order.length(); i++){
            hm.put(order.charAt(i),i);
        }
        int i = 0, j = 1;
        while(j < words.length){
            String x = words[i];
            String y = words[j];
            if(!compare(x,y,hm)) return false;
            i++;
            j++;
        }
        return true;
    }
    private boolean compare(String a, String b, HashMap<Character, Integer> hm){
        int len = Math.min(a.length(), b.length());
        int i = 0;
        while(i < len){
            char ai = a.charAt(i);
            char bi = b.charAt(i);

            if(hm.get(ai) < hm.get(bi)) return true;
            else if(hm.get(ai) == hm.get(bi)){i++; continue;}
            else return false;
        }
        if(i < a.length()-1) return false;
        return true;
    }
}