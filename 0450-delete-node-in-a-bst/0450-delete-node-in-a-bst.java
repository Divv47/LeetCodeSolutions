class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val>key)root.left = deleteNode(root.left,key);
        else if(root.val<key)root.right = deleteNode(root.right,key);
        else {
            // Found the node to delete
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
        root.val = findMin(root.right);
            // Delete the inorder successor
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    // Helper method to find the minimum value in the subtree
    private int findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }
}