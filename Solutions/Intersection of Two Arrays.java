// problem link
// https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i : nums1) hs1.add(i);
        HashSet<Integer> hs2 = new HashSet<>();
        for(int j : nums2){
            if(hs1.contains(j)) hs2.add(j);
        }
        int[] res = new int[hs2.size()];
        int id = 0;
        for(int i : hs2){
            res[id++] = i;
        }
        return res;
    }
}