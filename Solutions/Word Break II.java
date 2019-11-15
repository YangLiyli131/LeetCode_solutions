// problem link
// https://leetcode.com/problems/word-break-ii/

class Solution {
    private final HashMap<String, List<String>> cache = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        if(cache.containsKey(s)) return cache.get(s);
        List<String> res = new ArrayList<>();
        if(wordDict.contains(s)) res.add(s);
        int len = s.length();
        for(int i = 1; i < len; i++){
            String left = s.substring(0,i);
            String right = s.substring(i);
            if(wordDict.contains(left) && containsPrefix(wordDict,right)){
                for(String ss : wordBreak(right,wordDict)){
                    res.add(left + " " + ss);
                }
            }
        }
        cache.put(s,res);
        return res;
    }
    private boolean containsPrefix(List<String> wordDict, String s){
        for(int i = 0; i < s.length(); i++){
            if(wordDict.contains(s.substring(i))) return true;
        }
        return false;
    }
}