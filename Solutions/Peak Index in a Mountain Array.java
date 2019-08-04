// problem link
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for(int a = 1, b = A.length-2; a <= b; ){
            if(A[a-1] < A[a] && A[a+1] < A[a]) return a;
            if(A[b-1] < A[b] && A[b+1] < A[b]) return b;
            else{
                a++;b--;
            }
        }
        return 0;
    }
}