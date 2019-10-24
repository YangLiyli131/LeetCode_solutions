// problem link
// https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] nums, int k) {
        // create a hashmap to store sum of all previous subarrays
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int cur_sum = 0;
        int res = 0;
        for(int i : nums){
            cur_sum += i;
            if(hm.containsKey(cur_sum - k)){
                res = res + hm.get(cur_sum - k);
            }
            if(hm.containsKey(cur_sum)){
                hm.put(cur_sum, hm.get(cur_sum)+1);
            }else{
                hm.put(cur_sum,1);
            }
        }
        return res;
    }
}