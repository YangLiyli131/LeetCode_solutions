// problem link
// https://leetcode.com/problems/jewels-and-stones/

/*
easy question, check for each character in the target string to see if
it is among the jewels
*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int r = 0;
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(J.indexOf(c) != -1){
                r++;
            }
        }
        return r;
    }
}