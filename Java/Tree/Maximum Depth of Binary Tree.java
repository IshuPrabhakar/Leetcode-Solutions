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
    public int maxDepth(TreeNode root) {
        
        // Depth of the tree and height of the tree both are different
        // but in case oof maximum depth and height both are same
        
        // Base case
        if(root == null)
            return 0;
        
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        
        return 1 + Math.max(left_height, right_height);
    }
}