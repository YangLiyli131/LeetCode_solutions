// problem link
// https://leetcode.com/problems/minimum-depth-of-binary-tree/

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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return 1 + minDepth(root.right);
        if(root.right == null) return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left == null && root.right != null) return 1 + dfs(root.right);
        if(root.left != null && root.right == null) return 1 + dfs(root.left);
        return 1 + Math.min(dfs(root.left), dfs(root.right));
    }
    private int dfs(TreeNode n){
        if(n == null) return 0;
        if(n.left == null && n.right == null) return 1;
        if(n.left == null && n.right != null) return 1 + dfs(n.right);
        if(n.left != null && n.right == null) return 1 + dfs(n.left);
        return 1 + Math.min(dfs(n.left), dfs(n.right));
    }
}