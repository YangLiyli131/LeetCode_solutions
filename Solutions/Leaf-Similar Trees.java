// problem link
// https://leetcode.com/problems/leaf-similar-trees/

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lt1 = new ArrayList<>();
        List<Integer> lt2 = new ArrayList<>();
        helper(root1, lt1);
        helper(root2, lt2);
        if(lt1.size() != lt2.size()) return false;
        for(int i = 0; i < lt1.size(); i++){
            if(lt1.get(i) != lt2.get(i)) return false;
        }
        return true;
    }
    private void helper(TreeNode t, List<Integer> L){
        if(t == null) return;
        if(t.left == null && t.right == null) L.add(t.val);
        helper(t.left, L);
        helper(t.right, L);
    }
}