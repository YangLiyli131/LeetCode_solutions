// problem link
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : A){
            if(!hs.contains(i)) hs.add(i);
            else return i;
        }
        return -1;
    }
}

class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : A){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        int res = 0;
        for(int i : hm.keySet()){
            if(hm.get(i) != 1){
                res = i;
                break;
            }
        }
        return res;
    }
}