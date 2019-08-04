// problem link
// https://leetcode.com/problems/height-checker/

/*
create a new array with the correct order
check the number of mis-match between two arrays
*/

class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] aa = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            aa[i] = heights[i];
        }
        Arrays.sort(aa);
        for(int i = 0; i < heights.length; i++){
            if(aa[i] != heights[i]) res++;
        }
        return res;
    }
}