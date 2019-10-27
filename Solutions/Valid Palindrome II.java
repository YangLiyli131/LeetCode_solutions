// problem link
// https://leetcode.com/problems/valid-palindrome-ii/

class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isP(s, i+1, j) || isP(s, i, j-1);
            }
            i++; 
            j--;
        }
        return true;
    }
    private boolean isP(String s, int a, int b){
        while(a < b){
            if(s.charAt(a++) != s.charAt(b--)) return false;
        }
        return true;
    }
}