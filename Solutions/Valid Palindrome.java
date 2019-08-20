// problem link
// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        String ss = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : ss.toCharArray()){
            if((c >= 'a' & c <= 'z') || (c >= '0' & c <= '9')) sb.append(c);
        }
        int a = 0;
        int b = sb.length()-1;
        while(a < b){
            char x1 = sb.charAt(a);
            char x2 = sb.charAt(b);
            if(x1 != x2){
                return false;
            }
            a++;b--;
        }
        return true;
    }
}