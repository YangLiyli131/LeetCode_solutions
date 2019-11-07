// problem link
// https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        if(s == null || s.length() == 0) return s;
        int n = s.length();
        int[][] dp = new int[n][n];
        
        int start = 0;
        int maxLen = 1;
        
        // all single-character strings are palindromic
        for(int i = 0; i < n; i++) dp[i][i] = 1;
        // check all two-letter strings
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = 1;
                start = i;
                maxLen = 2;
            }
        }
        // check substrings with 3 or more letters
        for(int k = 3; k <= n; k++){
            for(int i = 0; i < n - k + 1; i++){
                int j = i + k - 1;
                if(dp[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 1;
                    if(k > maxLen){
                        maxLen = k;
                        start = i;
                    }
                }
            }
        }
        //System.out.println(start);
        //System.out.println(maxLen);
        return s.substring(start, start + maxLen);
    }
}