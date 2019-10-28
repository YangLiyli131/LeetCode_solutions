// problem link
// https://leetcode.com/problems/distance-between-bus-stops/

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int all = 0;
        int s = Math.min(start, destination);
        int d = Math.max(start, destination);
        for(int i : distance) all += i;
        int step = d - s;
        int t = 0;
        while(step > 0){
            t += distance[s];
            step--;
            s++;
        }
        return Math.min(all-t, t);
    }
}