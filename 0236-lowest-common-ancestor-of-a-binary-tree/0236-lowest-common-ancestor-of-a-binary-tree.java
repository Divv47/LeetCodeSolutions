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
    private boolean exists(TreeNode root , TreeNode node){
        if(root==node) return true;
        if(root==null) return false;
        return exists(root.left, node) || exists(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q == root ) return root;
        boolean pex = exists(root.left,p);
        boolean qex = exists(root.left,q);
        if(pex==true && qex == true) return lowestCommonAncestor(root.left,p,q);
        if(pex==false && qex == false) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
}