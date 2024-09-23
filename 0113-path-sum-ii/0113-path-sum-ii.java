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
    List<Integer> copy (List<Integer> arr){
        List<Integer> list = new ArrayList<>();
        for(int ele:arr){
            list.add(ele);
        }
        return list;
    }
    void helper(TreeNode root , int sum,List<List<Integer>> arr,List<Integer> ans){
        if(root==null) return;
        if(root.right==null && root.left==null){
            if(root.val==sum){
            ans.add(root.val);
            arr.add(ans);
            }
            return;
        }
        ans.add(root.val);
        List<Integer> ans1= copy (ans);
        List<Integer> ans2= copy (ans);
        helper(root.left,sum-root.val,arr,ans1);
        helper(root.right,sum-root.val,arr,ans2);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> ans = new ArrayList<Integer>();
        helper(root,targetSum,arr,ans);
        return arr;
    }
}