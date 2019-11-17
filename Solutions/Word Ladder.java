// problem link
// https://leetcode.com/problems/word-ladder/

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        // build a graph by constructing adjacency list
        wordList.add(beginWord);
        HashMap<String, List<String>> hm = new HashMap<>();
        HashMap<String, Integer> visited = new HashMap<>();
        HashMap<String, Integer> level = new HashMap<>();
        
        for(String s : wordList) hm.put(s, new ArrayList<String>());
        
        int len = wordList.size();
        int wlen = beginWord.length();
        for(int i = 0; i < len; i++){
            String a = wordList.get(i);
            for(int j = i+1; j < len; j++){
                String b = wordList.get(j);
                int k = 0, count = 0;
                while(k < wlen){
                    if(a.charAt(k) == b.charAt(k)) count++;
                    k++;
                }
                if(count == wlen - 1){
                    List<String> tt = hm.get(a);
                    tt.add(b);
                    hm.put(a, tt);
                    List<String> ttt = hm.get(b);
                    ttt.add(a);
                    hm.put(b, ttt);
                }
            }
            visited.put(wordList.get(i), 0);
        }
        
        // BFS
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        visited.put(beginWord, 1);
        level.put(beginWord, 1);
        while(!q.isEmpty()){
            String s = q.poll();
            if(s.equals(endWord)) return level.get(s);
            for(int i = 0; i < hm.get(s).size(); i++){
                String t = hm.get(s).get(i);
                if(visited.get(t) != 0) continue;
                q.add(t);
                visited.put(t,1);
                level.put(t, level.get(s)+1);
            }
        }
        return 0;
    }
}