// problem link
// https://leetcode.com/problems/subdomain-visit-count/

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hm = new HashMap<>();
        List<String> res = new ArrayList<>();
        int n;
        String key1;
        String key2;
        String key3;
        for(String s : cpdomains){
            String[] temp = s.split(" ");
            n = Integer.valueOf(temp[0]);
            
            key1 = temp[1];
            hm.put(key1, hm.getOrDefault(key1,0)+n);
            
            String[] tt = key1.split("\\.");
            if(tt.length == 2){
                key2 = tt[1];
                hm.put(key2, hm.getOrDefault(key2,0)+n);
            }
            if(tt.length == 3){
                key3 = tt[2];
                hm.put(key3, hm.getOrDefault(key3,0)+n);
                key2 = tt[1] + "." + tt[2];
                hm.put(key2, hm.getOrDefault(key2,0)+n);
            }
        }
        for(String s : hm.keySet()){
            res.add(Integer.toString(hm.get(s)) + " " + s);
        }
        return res;
    }
}