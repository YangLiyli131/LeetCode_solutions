// problem link
// https://leetcode.com/problems/relative-sort-array/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            hm.put(arr1[i], hm.getOrDefault(arr1[i],0)+1);
        }
        int[] res = new int[arr1.length];
        int id = 0;
        for(int i : arr2){
            while(hm.get(i) > 0){
                res[id++] = i;
                hm.put(i, hm.get(i)-1);
            }
            if(hm.get(i) == 0) hm.remove(i);
        }
        for(int i = 0; i <= 1000; i++){
            while(hm.containsKey(i) && hm.get(i) > 0){
                res[id++] = i;
                hm.put(i,hm.get(i)-1);
            }
        }
        return res;
    }
}