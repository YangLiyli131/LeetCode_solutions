// problem link
// https://leetcode.com/problems/sum-root-to-leaf-numbers/

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
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    private int helper(TreeNode t, int s){
        if(t == null) return 0;
        s = s * 10 + t.val;
        if(t.left == null && t.right == null) return s;
        return helper(t.left,s) + helper(t.right,s);
    }
}