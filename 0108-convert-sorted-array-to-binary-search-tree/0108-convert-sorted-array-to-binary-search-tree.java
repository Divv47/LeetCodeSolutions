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
    TreeNode helper(int[] nums , int lo , int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,lo,mid-1);
        root.right = helper(nums,mid+1,hi);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int hi = nums.length-1;
        int lo = 0;
        return helper(nums,lo,hi);
    }
}