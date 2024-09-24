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
    //TreeNode print(TreeNode root)
    TreeNode helper(TreeNode root, int val){
        if(root==null || root.val==val) return root;
        else if(root.val>val) root = helper(root.left,val);
        else root = helper(root.right,val);
        return root;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return helper(root,val);
    }
}