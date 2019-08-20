// problem link
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length-1;
        //while(numbers[b] >= target) b--;
        int[] res = new int[2];
        while(numbers[a] + numbers[b] != target){
            if(numbers[a] + numbers[b] > target) b--;
            if(numbers[a] + numbers[b] < target) a++;
        }
        res[0] = a+1;
        res[1] = b+1;
        return res;
    }
}