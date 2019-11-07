// problem link
// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        char[] ch = str.toCharArray();
		// flag variable to check if the number is postive or negative
        int minus = 0;
        int id = 0; // find first valid position
        while(id < ch.length){
            if(ch[id] != ' ') break;
            id++;
        }
        if(id == ch.length) return 0; // for the case of all white space
        int total = 0;
        for(int i = id; i < ch.length; i++){
            // only the first +/- counts valid
            if(i == id && ch[i] == '-') {minus = 1; continue;}
            if(i == id && ch[i] == '+') continue;
            if(!Character.isDigit(ch[i])) break;
			// handle overflow
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < ch[i]-'0'){
                return minus != 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + (ch[i] - '0');

        }
        if(minus == 1) return -total;
        else return total;
    }
}