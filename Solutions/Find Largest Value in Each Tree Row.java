// problem link
// https://leetcode.com/problems/find-largest-value-in-each-tree-row/

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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        
        q.add(root);
        List<Integer> t = new ArrayList<>();
        t.add(root.val);
        res.add(root.val);
    
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
                if(tt.size() != 0) res.add(max_L(tt));
            }
        }
        return res;
    }
    private int max_L(List<Integer> L){
        int t = Integer.MIN_VALUE;
        for(int i : L){
            if (i > t) t = i;
        }
        return t;
    }
}