// problem link
// https://leetcode.com/problems/defanging-an-ip-address/

/*
Easy question, scan the input string
If a dot is encountered, add [ and ] on its left and right
Use StringBuilder to store the result of each action
*/

class Solution {
    public String defangIPaddr(String address) {
        char[] ch = address.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            if(c == '.'){
                sb.append('[');
                sb.append(c);
                sb.append(']');
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}