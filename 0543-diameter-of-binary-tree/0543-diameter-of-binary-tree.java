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
    private int level(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(level(root.left) ,level(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        // TreeNode newroot = new TreeNode();
        int newroot = level(root.left)+ level(root.right);
        int leftNew = diameterOfBinaryTree(root.left);
        int rightNew = diameterOfBinaryTree(root.right);
        return Math.max(newroot,Math.max(leftNew,rightNew));
    }
}