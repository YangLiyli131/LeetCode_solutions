// problem link
// https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() <= 1) return s;
        char[] ch = s.toCharArray();
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        int st = 0;
        int en = s.length()-1;
        while(st < en){
            while(st < en && !vowels.contains(ch[st])) st++;
            while(st < en && !vowels.contains(ch[en])) en--;
            char t = ch[st];
            ch[st] = ch[en];
            ch[en] = t;
            st++;
            en--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            sb.append(c);
        }
        return sb.toString();
    }
}