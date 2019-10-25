// problem link
// https://leetcode.com/problems/validate-binary-search-tree/

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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    private boolean helper(TreeNode tn, Integer minn, Integer maxx){
        if(tn == null) return true;
        if((minn != null && tn.val <= minn) || (maxx != null && tn.val >= maxx)) return false;
        return (helper(tn.left, minn, tn.val) && helper(tn.right,tn.val, maxx));
    }
}