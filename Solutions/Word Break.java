// problem link
// https://leetcode.com/problems/word-break/

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        for(int i = 0; i < len; i++){
            String st = s.substring(0,i+1);
            if(wordDict.contains(st)){
                // check the rest of the string
                if(i == len - 1) return true;
                if(wordBreak(s.substring(i+1,len), wordDict)){
                    return true;
                }
            }
        }
        return false;
    }
}