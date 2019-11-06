// problem link
// https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        return QuickSelect(nums, 0, nums.length-1, k);
    }
    private int QuickSelect(int[] nums, int low, int high, int k){
        int pivot = low;
        for(int i = low; i < high; i++){
            if(nums[i] <= nums[high]){
                swap(nums, pivot, i);
                pivot++;
            }
        }
        swap(nums,pivot,high);
        // now values <= pivot are on the left
        int c = high - pivot + 1;
        if(c == k) return nums[pivot];
        else if(c > k){
            // target on the right
            return QuickSelect(nums, pivot+1, high, k);
        }else{
            // target on left
            return QuickSelect(nums, low, pivot-1, k-c);
        }
    }
    private void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}