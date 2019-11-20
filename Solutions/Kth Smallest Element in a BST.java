// problem link
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> li = new ArrayList<>();
        
        while(root != null || !st.isEmpty()){
            while(root != null){
                st.push(root);
                root = root.left;
            }
            if(!st.isEmpty()){
                root = st.pop();
                li.add(root.val);
                if(li.size() == k) return root.val;
                root = root.right;
            }
        }
        return 0;
    }
}