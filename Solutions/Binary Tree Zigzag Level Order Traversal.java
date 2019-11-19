// problem link
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        
        q.add(root);
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        res.add(temp);
        int id = 1;
        
        while(!q.isEmpty()){
            TreeNode tn = q.poll();
            if(tn.left != null) qq.add(tn.left);
            if(tn.right != null) qq.add(tn.right);
            if(q.isEmpty()){
                List<Integer> x = new ArrayList<>();
                while(!qq.isEmpty()){
                    TreeNode g = qq.poll();
                    if(id % 2 == 1){
                        // right-left order
                        x.add(0,g.val);
                    }else{
                        x.add(g.val);
                    }
                    q.add(g);                    
                }
                id++;
                if(x.size() != 0) res.add(x);
            }            
        }
        return res;
    }
}