/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void invert(TreeNode root){
        if(root==null) return;
        if(root.left==null&&root.right==null) return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invert(root.left);
        invert(root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.left);
        return isSameTree(root.left,root.right);
    }
}