// problem link
// https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] res = new int[2];
        int total = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(!hs.contains(i)){
                hs.add(i);
                total += i;
            }
            else res[0] = i;
        }
        res[1] = (n+1)*n/2 - total;
        return res;
    }
}