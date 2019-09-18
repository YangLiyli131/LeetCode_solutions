// problem link
// https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        while(i < n){
            if(A[i] % 2 == 1){
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
                j += 2;
            }
            else{
                i += 2;
            }
        }
        return A;
    }
}