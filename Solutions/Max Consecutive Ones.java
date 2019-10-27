// problem link
// https://leetcode.com/problems/max-consecutive-ones/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int gm = 0;
        int lm = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                gm = gm >= lm? gm : lm;
                lm = 0;
            }else{
                lm++;
            }
        }
        return gm > lm? gm : lm;
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int res = 0;
        int i = 0;
        int j;
        while(i < len){
            // the window start with a 1
            if(nums[i] == 0){
                i++;
                continue;
            }
            // find the end of the window
            j = i + 1;
            if(j >= len){
                res = res < (j-i)? (j-i) : res;
                break;
            }
            while(j < len){
                if(j != (len-1) && nums[j] == 1){
                    j++;
                    continue;
                }else{
                    if(nums[j] == 1 && j == (len-1)) j++;
                    res = res < (j-i)? (j-i) : res;
                    //i = j + 1;
                    break;
                }
            }
            i = j + 1;
        }
        return res;
    }
}