// problem link
// https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        boolean[] isP = new boolean[n];
        for(int i = 2; i < n; i++) isP[i] = true;
        for(int i = 2; i * i < n; i++){
            if(!isP[i]) continue;
            for(int j = i * i; j < n; j += i) isP[j] = false;
        }
        int res = 0;
        for(int i = 2; i < n; i++){
            if(isP[i]) res++;
        }
        return res;
    }
}