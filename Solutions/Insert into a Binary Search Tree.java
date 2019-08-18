// problem link
// https://leetcode.com/problems/insert-into-a-binary-search-tree/

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            root.left = null;
            root.right = null;
        }
        else{
            if(root.val < val){
                root.right = insertIntoBST(root.right, val);
            }
            else if(root.val > val){
                root.left = insertIntoBST(root.left,val);
            }
        }
        return root;
    }
}