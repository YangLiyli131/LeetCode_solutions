// problem link
// https://leetcode.com/problems/goat-latin/

class Solution {
    public String toGoatLatin(String S) {
        String[] st = S.split(" ");
        for(int i = 0; i < st.length; i++){
            String t = st[i];
            char x = t.charAt(0);
            if(isV(x)){
                st[i] = t + "ma";
            }else{
                st[i] = t.substring(1,t.length()) + t.substring(0,1) + "ma";
            }
            for(int j = 0; j < i+1; j++){
                st[i] = st[i] + "a";
            }
        }
        String res = "";
        for(String h : st){
            res += h + " ";
        }
        return res.trim();
    }
    private boolean isV(char xx){
        char x = Character.toLowerCase(xx);
        return x == 'a' || x == 'e' || x == 'o' || x == 'i' || x == 'u';
    }
}