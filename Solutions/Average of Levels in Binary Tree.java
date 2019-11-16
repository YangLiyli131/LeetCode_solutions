// problem link
// https://leetcode.com/problems/average-of-levels-in-binary-tree/

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        res.add((double)root.val);
        q.add(root);
        double count = 0;
        double total = 0;
        while(!q.isEmpty()){
            TreeNode tn = q.poll();
            if(tn.left != null) qq.add(tn.left);
            if(tn.right != null) qq.add(tn.right);
            if(q.isEmpty()){
                while(!qq.isEmpty()){
                    count += 1;
                    TreeNode x = qq.poll();
                    total += x.val;
                    q.add(x);
                }
                if(count != 0) res.add(total / count);
                count = 0;
                total = 0;
            }
        }
        return res;
    }
}