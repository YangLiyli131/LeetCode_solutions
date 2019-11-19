// problem link
// https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums == null || nums.length < 4) return res;
        int L = nums.length;
        for(int i = 0; i < L-3; i++){
            int a = nums[i];
            if(i != 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < L-2; j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                int b = nums[j];
                int left = j+1, right = L-1;
                while(left < right){
                    int c = nums[left], d = nums[right];
                    if(a + b + c + d < target) left++;
                    else if(a + b + c + d > target) right--;
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(a);
                        temp.add(b);
                        temp.add(c);
                        temp.add(d);
                        res.add(temp);
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}