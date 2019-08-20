// problem link
// https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String s) {
        char[] ch = s.toCharArray();
        int res = 0;
        int id = 0;
        for(int i = ch.length-1; i >= 0; i--){
            char x = ch[i];
            res += (x - 'A' + 1) * Math.pow(26,id);
            id++;
        }
        return res;
    }
}