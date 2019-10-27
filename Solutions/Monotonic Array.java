// problem link
// https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for(int i = 1; i < A.length; i++){
            inc &= A[i] >= A[i-1];
            dec &= A[i] <= A[i-1];
        }
        return inc || dec;
    }
}

class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length == 1) return true;
        int i = 0, j = 1;
        int pre = A[j++] - A[i++];
        while(j < A.length){
            int cur = A[j] - A[i];
            if((cur * pre) < 0) return false;
            pre = cur == 0? pre : cur;
            j++;
            i++;
        }
        return true;
    }
}