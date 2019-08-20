// problem link
// https://leetcode.com/problems/sum-of-even-numbers-after-queries/

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int S = 0;
        for(int i : A){
            if(i % 2 ==0) S += i;
        }
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int change = queries[i][0];
            int idx = queries[i][1];
            if(A[idx] % 2 == 0) S -= A[idx];
            A[idx] += change;
            if(A[idx] % 2 == 0) S += A[idx];
            res[i] = S;
        }
        return res;
    }
}