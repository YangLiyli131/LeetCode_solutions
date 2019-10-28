// problem link
// https://leetcode.com/problems/custom-sort-string/

class Solution {
    public String customSortString(String S, String T) {
        int[] counter = new int[26];
        for(char c : T.toCharArray()){
            counter[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray()){
            while(counter[c-'a']-- > 0) sb.append(c);
        }
        for(char x = 'a'; x <= 'z'; x++){
            while(counter[x-'a']-- > 0) sb.append(x);
        }
        
        return sb.toString();
    }
}