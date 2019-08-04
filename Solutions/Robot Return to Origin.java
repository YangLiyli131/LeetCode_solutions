// problem link
// https://leetcode.com/problems/robot-return-to-origin/

/*
set up step size, left/right step size = 1, up/down step size = 2
*/

class Solution {
    public boolean judgeCircle(String moves) {
        char[] ch = moves.toCharArray();
        int m = 0;
        for(char c : ch){
            if(c == 'L') m -= 1;
            else if(c == 'R')  m += 1;
            else if(c == 'U')  m += 2;
            else m -= 2;
        }
        return m == 0;
    }
}