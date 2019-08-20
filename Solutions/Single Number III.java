// problem link
// https://leetcode.com/problems/single-number-iii/

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            if(hm.containsKey(i)) hm.put(i, hm.get(i)+1);
            else hm.put(i,1);
        }
        int id = 0;
        for(int k : hm.keySet()){
            if(hm.get(k) == 1){
                res[id] = k;
                id++;
            } 
        }
        return res;
    }
}