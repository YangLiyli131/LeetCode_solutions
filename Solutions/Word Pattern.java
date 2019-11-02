// problem link
// https://leetcode.com/problems/word-pattern/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] cha = pattern.toCharArray();
        String[] ss = str.split(" ");
        if(cha.length != ss.length) return false;
        HashMap<Character,String> hm = new HashMap<>();
        for(int i = 0; i < cha.length; i++){
            if(!hm.containsKey(cha[i])){
                if(hm.values().contains(ss[i])) return false;
                hm.put(cha[i], ss[i]);
            }else{
                if(!hm.get(cha[i]).equals(ss[i])) return false;
            }
        }
        return true;
    }
}