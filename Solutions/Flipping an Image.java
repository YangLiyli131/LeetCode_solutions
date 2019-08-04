// problem link
// https://leetcode.com/problems/flipping-an-image/

/*
For each row in matrix A, 
use two pointers from the front and end of the row,
swap the values and flip ( if 0, set to 1, vice versa)
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++){
            int[] t = A[i];
            for(int a = 0, b = t.length-1; a <= b; a++, b--){
                int temp = t[a];
                t[a] = t[b];
                t[b] = temp;
                if(a != b){
                    t[a] = t[a] == 0? 1 : 0;
                    t[b] = t[b] == 0? 1 : 0;
                }else{
                    t[a] = t[a] == 0? 1 : 0;
                }
                
            }
            A[i] = t;
        }
        return A;
    }
}