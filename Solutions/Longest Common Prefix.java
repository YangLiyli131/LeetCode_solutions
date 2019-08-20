// problem link
// https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String res = "";
        int max_len = Integer.MAX_VALUE;
        for(String s : strs){
            max_len = s.length() < max_len? s.length() : max_len;
        }
        for(int i = 0; i < max_len; i++){
            char x = strs[0].charAt(i); //System.out.println(x);
            for(int j = 1; j < strs.length; j++){
                char y = strs[j].charAt(i);//System.out.println(y);
                if((x-'a') != (y-'a')){
                    return res;
                }
            }
            res += Character.toString(x);
        }
        return res;
    }
}