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
    public int minDepth(TreeNode root) {
        return findMinDepth(root);
    }

    int findMinDepth(TreeNode root)
    {
        if(root==null)
       {
        return 0;
       }
       else if(root.left==null && root.right==null)
       {
        return 1;
       }
       else if(root.left==null)
       {
         return findMinDepth(root.right)+1;
       }
       else if(root.right==null)
       {
        return findMinDepth(root.left)+1;
       }
        return Math.min(findMinDepth(root.left),findMinDepth(root.right))+1;
    }
}
