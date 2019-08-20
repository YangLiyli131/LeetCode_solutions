// problem link
// https://leetcode.com/problems/smallest-range-i/

class Solution {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int a = A[0] + K;
        int b = A[A.length-1] - K;
        return a >= b? 0 : (b-a);
    }
}