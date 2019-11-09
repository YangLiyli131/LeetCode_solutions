// problem link
// https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length-1;
        while(i < j){
            while(i < j && A[i] % 2 == 0) i++;
            while(i < j && A[j] % 2 == 1) j--;
            if(i >= j) break;
            int t = A[i];
            A[i] = A[j];
            A[j] = t;
            i++;
            j--;
        }
        return A;
    }
}