// problem link
// https://leetcode.com/problems/binary-tree-preorder-traversal/

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(root != null || !st.isEmpty()){
            while(root != null){
                res.add(root.val);
                st.push(root);
                root = root.left;
            }
            if(!st.isEmpty()){
                root = st.pop();
                root = root.right;
            }
        }
        return res;
    }
}