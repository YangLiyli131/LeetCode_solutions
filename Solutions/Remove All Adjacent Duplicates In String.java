// problem link
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        for(char c : S.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }else if(c != st.peek()){
                st.push(c);
            }else{
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}