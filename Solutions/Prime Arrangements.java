// problem link
// https://leetcode.com/problems/prime-arrangements/

class Solution {
    public int numPrimeArrangements(int n) {
        int a = countPrimes(n);
        //System.out.println(a);
        long res = 1;
        for(int i = 1; i <= a; i++){
            res = res * i % 1000000007;
        }
        for(int i = 1; i <= n - a; i++){
            res = res * i % 1000000007;
        }
        return (int)res;
    }
    public int countPrimes(int n){
        boolean[] isP = new boolean[n+1];
        for(int i = 2; i <= n; i++) isP[i] = true;
        for(int i = 2; i * i <= n; i++){
            if(!isP[i]) continue;
            for(int j = i * i; j <= n; j += i) isP[j] = false;
        }
        int res = 0;
        for(int i = 2; i <= n; i++){
            if(isP[i]) res++;
        }
        return res;
    }
}