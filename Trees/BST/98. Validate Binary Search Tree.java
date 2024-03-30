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
    public boolean isValidBST(TreeNode root) {
        return isValidBinaryTree(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBinaryTree(TreeNode root,long minval,long maxval)
    {
        if(root==null)
        return true;
        if(root.val>=maxval||root.val<=minval)
        return false;
        return isValidBinaryTree(root.left,minval,root.val)&&isValidBinaryTree(root.right,root.val,maxval);
    }
}
