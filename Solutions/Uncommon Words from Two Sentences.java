// problem link
//https://leetcode.com/problems/uncommon-words-from-two-sentences/

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> ls = new ArrayList<>();
        HashMap<String,Integer> hm = new HashMap<>();
        String s = A + " " + B;
        String[] ss = s.split(" ");
        for(String x : ss){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(String i : hm.keySet()){
            if(hm.get(i) == 1) ls.add(i);
        }
        return ls.toArray(new String[0]); 
    }
}