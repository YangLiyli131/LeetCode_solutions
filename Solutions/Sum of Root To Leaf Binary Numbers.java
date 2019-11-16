// problem link
// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/

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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    private int dfs(TreeNode n, int val){
        if(n == null) return 0;
        val = val * 2 + n.val;
        return n.left == n.right? val : dfs(n.left,val) + dfs(n.right,val);
    }
}