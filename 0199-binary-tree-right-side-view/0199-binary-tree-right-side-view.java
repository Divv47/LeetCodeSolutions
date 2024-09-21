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
    public List<Integer> rightSideView(TreeNode root) {
        int n = levels(root);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ans.add(0);
        }
        preorder(root,0,ans);
        return ans;
    }
    int levels(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    void preorder(TreeNode root , int level, List<Integer> ans){
        if(root==null) return;
        ans.set(level,root.val);
        preorder(root.left,1+level,ans);
        preorder(root.right,1+level,ans);
    }
}