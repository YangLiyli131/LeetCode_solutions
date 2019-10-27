// problem link
// https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] A, int K) {
        int i = 0, j;
        for(j = 0; j < A.length; j++){
            if(A[j] == 0) K--;
            if(K < 0 && A[i++] == 0) K++;
        }
        return j-i;
    }
}

// TLE
class Solution {
    public int longestOnes(int[] A, int K) {
        int gm = 0;
        int lm = 0;
        int counter;
        int res = 0;
        for(int x = 0; x < A.length; x++){
            counter = 0;
            for(int i = x; i < A.length; i++){
                if(A[i] == 0){
                    counter++;
                    if(counter > K){
                        gm = gm >= lm? gm : lm;
                        lm = 0;
                        break;
                    }else{
                        lm++;
                    }
                }else{
                    lm++;
                }
            }
            gm = gm >= lm? gm : lm;
            lm = 0;
            res = res > gm? res : gm;
        }
        return res;
    }
}