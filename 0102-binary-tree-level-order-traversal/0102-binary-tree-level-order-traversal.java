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
    private void lizard(TreeNode root , int level ,int lvl ,List<Integer> arr ){
        if(root==null) return;
        if(level>lvl) return;
        if(level==lvl) arr.add(root.val);
        lizard(root.left,level+1,lvl,arr);
        lizard(root.right,level+1,lvl,arr);
    }
    int level(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(level(root.left), level(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = level(root);
        for(int i =0;i<lvl;i++){
            List<Integer> arr = new ArrayList<>();
            lizard(root,0,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}