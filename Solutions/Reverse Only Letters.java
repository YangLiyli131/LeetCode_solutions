// problem link
// https://leetcode.com/problems/reverse-only-letters/

class Solution {
    public String reverseOnlyLetters(String S) {
        char[] ch = S.toCharArray();
        int a = 0;
        int b = ch.length-1;
        while(a < b){
            while(a < b && !isletter(ch[a])) a++;
            while(b > a && !isletter(ch[b])) b--;
            char temp = ch[a];
            ch[a] = ch[b];
            ch[b] = temp;
            a++;
            b--;
        }
        return String.copyValueOf(ch);
    }
    public boolean isletter(char c){
        if(c >= 'a' && c <= 'z') return true;
        if(c >= 'A' && c <= 'Z') return true;
        return false;
    }
}