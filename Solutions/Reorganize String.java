// problem link
// https://leetcode.com/problems/reorganize-string/

class Solution {
    public String reorganizeString(String S) {
        if(S == null || S.length() == 0) return "";
        char[] ch = S.toCharArray();
        int len = ch.length;
        int id = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((i,j) -> hm.get(j) - hm.get(i));
        pq.addAll(hm.keySet());
        
        char[] res = new char[len];
        while(!pq.isEmpty()){
            char ct = pq.poll();
            int freq = hm.get(ct);
            while(freq-- != 0){
                if(id >= len) id = 1;
                res[id] = ct;
                id += 2;
            }
        }
        for(int i = 1; i < len; i++){
            if(res[i] == res[i-1]) return "";
        }
        StringBuilder sb = new StringBuilder();
        for(char c : res) sb.append(c);
        return sb.toString();
    }
}