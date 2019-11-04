// problem link
// https://leetcode.com/problems/loud-and-rich/

class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int N = quiet.length;
        int[] res = new int[N];
        for(int i = 0; i < N; i++) res[i] = -1;
        List<Integer>[] bigger = new ArrayList[N];
        for(int i = 0; i < N; i++) bigger[i] = new ArrayList<>();
        for(int[] e : richer) bigger[e[1]].add(e[0]);
        for(int i = 0; i < N; i++){
            dfs(bigger, quiet, i, res);
        }
        return res;
    }
    private int dfs(List<Integer>[] bigger, int[] quiet, int i, int[] res){
        if(res[i] == -1){
            res[i] = i;
            for(int r : bigger[i]){
                int next = dfs(bigger, quiet, r, res);
                if(quiet[res[i]] > quiet[next]) res[i] = next;
            }
        }
        return res[i];
    }
}