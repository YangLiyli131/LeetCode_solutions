// problem link
// https://leetcode.com/problems/minimum-genetic-mutation/

class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashMap<String, List<String>> hm = new HashMap<>();
        String[] dic = new String[bank.length+1];
        for(int i = 0; i < bank.length; i++) dic[i+1] = bank[i];
        dic[0] = start;
        
        HashMap<String, Integer> visited = new HashMap<>();
        HashMap<String, Integer> level = new HashMap<>();
        for(String s: dic) hm.put(s, new ArrayList<String>());
        if(!hm.containsKey(end)) return -1;
        
        int len = dic.length, wlen = end.length();
        for(int i = 0; i < len; i++){
            String a = dic[i];
            for(int j = i+1; j < len; j++){
                String b = dic[j];
                int k = 0, count = 0;
                while(k < wlen){
                    if(a.charAt(k) == b.charAt(k)) count++;
                    k++;
                }
                if(count == wlen-1){
                    List<String> t1 = hm.get(a);
                    t1.add(b);
                    hm.put(a,t1);
                    List<String> t2 = hm.get(b);
                    t2.add(a);
                    hm.put(b,t2);
                }
            }
            visited.put(a,0);
        }
        // now the adjacency list is done
        // BFS
        Queue<String> q = new LinkedList<>();
        q.add(start);
        visited.put(start,1);
        level.put(start,1);
        while(!q.isEmpty()){
            String s = q.poll();
            if(s.equals(end)) return level.get(s)-1;
            for(int i = 0; i < hm.get(s).size(); i++){
                String t = hm.get(s).get(i);
                if(visited.get(t) != 0) continue;
                q.add(t);
                visited.put(t,1);
                level.put(t, level.get(s)+1);
            }
        }
        return -1;
    }
}