// problem link
// https://leetcode.com/problems/palindromic-substrings/

class Solution {
    public int countSubstrings(String s) {
        int res = 0, n = s.length();
        int[][] dp = new int[n][n];
        for(int d = 0; d < n; d++){
            for(int i = 0; i + d < n; i++){
                int j = i + d;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = i+1 > j-1? 1 : dp[i+1][j-1];
                    if(dp[i][j] == 1) res++;
                }
            }
        }
        return res;
    }
}

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int res = 0;
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++) {dp[i][i] = 1; res++;}
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                res += isP(s.substring(i,j+1));
            }
        }
        return res;
    }
    private int isP(String s){
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return 0;
            j--;
            i++;
        }
        return 1;
    }
}