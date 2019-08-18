// problem link
// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(root != null || !st.isEmpty()){
            while(root != null){
                st.push(root);
                root = root.left;
            }
            if(!st.isEmpty()){
                root = st.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}