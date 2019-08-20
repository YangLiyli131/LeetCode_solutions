// problem link
// https://leetcode.com/problems/k-closest-points-to-origin/

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][];
        int[] dis = new int[points.length];
        int[] tep = new int[points.length];
        for(int i = 0; i < points.length; i++){
            int[] x = points[i];
            int a = x[0];
            int b = x[1];
            dis[i] = (a*a + b*b);
            tep[i] = (a*a + b*b);
        }
        Arrays.sort(tep);
        int thresh = tep[K-1];
        int id = 0;
        for(int i = 0; i < points.length; i++){
            if(dis[i] <= thresh){
                res[id] = points[i];
                id++;
            }
        }
        return res;
    }
}