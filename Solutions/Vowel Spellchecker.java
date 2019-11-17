// problem link
// https://leetcode.com/problems/vowel-spellchecker/

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> hs = new HashSet<>();
        for(String s : wordlist) hs.add(s);
        HashMap<String, String> cap = new HashMap<>();
        HashMap<String, String> vow = new HashMap<>();
        
        for(String w : wordlist){
            String low = w.toLowerCase(), novow = low.replaceAll("[aeiou]", "#");
            cap.putIfAbsent(low, w);
            vow.putIfAbsent(novow, w);
        }
        for(int i = 0; i < queries.length; i++){
            String s = queries[i];
            if(hs.contains(s)) continue;
            String ss = s.toLowerCase(), dss = ss.replaceAll("[aeiou]", "#");
            if(cap.containsKey(ss)) queries[i] = cap.get(ss);
            else if(vow.containsKey(dss)) queries[i] = vow.get(dss);
            else queries[i] = "";
        }
        return queries;
    }
}