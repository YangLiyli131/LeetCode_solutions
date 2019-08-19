// problem link
// https://leetcode.com/problems/maximum-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null) return null;
        return helper(nums, 0, nums.length - 1);
    }
    private TreeNode helper(int[] nums, int a, int b){
        if(a > b) return null;
        int idMax = a;
        for(int i = a + 1; i <= b; i++){
            if(nums[i] > nums[idMax]){
                idMax = i;
            }
        }
        TreeNode root = new TreeNode(nums[idMax]);
        root.left = helper(nums, a, idMax-1);
        root.right  = helper(nums, idMax+1, b);
        return root;
    }
}