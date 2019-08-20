// problem link
// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String sx = Integer.toString(x);
        int s1 = 0;
        int s2 = sx.length()-1;
        boolean flag = true;
        while(s1 < s2){
            char a = sx.charAt(s1);
            char b = sx.charAt(s2);
            if(a != b){
                flag = false;
                break;
            }
            s1++;
            s2--;
        }
        return flag;
    }
}