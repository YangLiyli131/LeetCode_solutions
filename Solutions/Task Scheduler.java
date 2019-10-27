// problem link
// https://leetcode.com/problems/task-scheduler/

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counter = new int[26];
        int maxfreq = 0;
        for(char c : tasks){
            counter[c - 'A']++;
        }
        for(int i : counter){
            maxfreq = maxfreq < i? i : maxfreq;
        }
        int p = 0;
        for(int i : counter){
            if(i == maxfreq) p++;
        }
        int x = (maxfreq - 1) * (n + 1) + p;
        int y = tasks.length;
        return x < y? y : x;
    }
}