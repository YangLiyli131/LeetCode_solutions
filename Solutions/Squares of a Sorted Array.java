// problem link
// https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++) A[i] = Math.abs(A[i] * A[i]);
        Arrays.sort(A);
        return A;
    }
}