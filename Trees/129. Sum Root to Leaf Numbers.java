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
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int currentsum)
    {
        if(root==null)
        return 0;
        currentsum=currentsum*10+root.val;
        if(root.left==null&&root.right==null)
        return currentsum;
        return dfs(root.left,currentsum)+dfs(root.right,currentsum);
    }
}
