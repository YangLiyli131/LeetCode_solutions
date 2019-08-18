// problem link
// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        
        q.add(root);
        List<Integer> t = new ArrayList<>();
        t.add(root.val);
        res.add(t);
    
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            if(n.left != null){
                qq.add(n.left);
            }
            if(n.right != null){
                qq.add(n.right);
            }
            if(q.isEmpty()){
                List<Integer> tt = new ArrayList<>();
                while(!qq.isEmpty()){
                    TreeNode x = qq.poll();
                    tt.add(x.val);
                    q.add(x);
                }
                if(tt.size() != 0) res.add(tt);
            }
        }
        List<List<Integer>> ress = new ArrayList<>();
        while(res.size() != 0) ress.add(res.remove(res.size()-1));
        return ress;

    }
}