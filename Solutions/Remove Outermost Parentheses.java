// problem link
// https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int count_left = 0, count_right = 0;
        for(int start = 0, i = 0; i < S.length() && start < S.length(); i++){
            if(S.charAt(i) == '(') count_left++;
            else count_right++;
            if(count_left == count_right){
                // remove the leftmost and rightmost character
                sb.append(S.substring(start+1, i));
                start = i+1;
                count_left = 0;
                count_right = 0;
            }
        }
        return sb.toString();
    }
}