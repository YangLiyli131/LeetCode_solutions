// problem link
// https://leetcode.com/problems/increasing-order-search-tree/

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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> lt = new ArrayList<>();
        helper(root,lt);
        TreeNode new_root = new TreeNode(lt.get(0));
        TreeNode thread = new_root;
        for(int i = 1; i < lt.size(); i++){
            thread.left = null;
            thread.right = new TreeNode(lt.get(i));
            thread = thread.right;
        }
        return new_root;
    }
    private void helper(TreeNode t, List<Integer> L){
        if(t == null) return;
        
        helper(t.left, L);
        L.add(t.val);
        helper(t.right, L);
    }
}