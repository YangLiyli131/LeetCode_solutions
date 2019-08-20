// problem link
// https://leetcode.com/problems/basic-calculator/

class Solution {
    public int calculate(String s) {
        int res = 0;
        if(s == null) return 0;
        if(s.length() == 0) return 0;
        
        int sign = 1;
        int num = 0;
        Stack<Integer> st = new Stack<>();
        st.push(sign);
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }
            else if(c == '+' || c == '-'){
                res += sign * num;
                sign = st.peek() * (c == '+' ? 1 : -1);
                num = 0;
            }
            else if(c == '('){
                st.push(sign);
            }
            else if(c == ')') st.pop();
        }
        return res + sign * num;
    }
}