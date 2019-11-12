// problem link
// https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int d = Integer.MAX_VALUE;
        int l, r, a, b ,c;
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                l = i + 1;
                r = nums.length-1;
                while(l < r){
                    a = nums[i]; b = nums[l]; c = nums[r];
                    int total = a + b + c;
                    if(total == target) return total;
                    else if(total > target){
                        if(total - target < d){
                            d = total - target;
                            res = total;
                        }
                        r--;
                    }else{
                        if(-total + target < d){
                            d = -total + target;
                            res = total;
                        }
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */