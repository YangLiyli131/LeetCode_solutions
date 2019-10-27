// problem link
// https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int rows = intervals.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int i = 1; i < rows; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            
            if(a > end){
                arr1.add(start);
                arr2.add(end);
                start = a;
                end = b;
                continue;
            }
            if(a == end){
                end = b;
                continue;
            }
            if(b >= end){
                end = b;
                continue;
            }
            
        }
        arr1.add(start);
        arr2.add(end);
        
        int[][] res = new int[arr1.size()][2];
        int id = 0;
        for(int i : arr1){
            res[id++][0] = i;
        }
        id = 0;
        for(int j : arr2){
            res[id++][1] = j;
        }
        return res;
    }
}