// problem link
// https://leetcode.com/problems/minimum-absolute-difference/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] < mini) mini = arr[i] - arr[i-1];
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == mini){
                List<Integer> t = new ArrayList<>();
                t.add(arr[i-1]);
                t.add(arr[i]);
                res.add(t);
            }
        }
        return res;
    }
}