// problem link
// https://leetcode.com/problems/path-sum/

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == sum) return true;
        return dfs(root.left, sum - root.val) || dfs(root.right, sum - root.val);
    }
    private boolean dfs(TreeNode t, int n){
        if(t == null) return false;
        if(t.val == n && t.left == null && t.right == null) return true;
        return dfs(t.left, n - t.val) || dfs(t.right, n - t.val);
    }
}