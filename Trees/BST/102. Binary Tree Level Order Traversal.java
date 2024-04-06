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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outer=new ArrayList<>();
        List<TreeNode> level=new ArrayList<>();
        if(root==null)
        return outer;
        level.add(root);
        while(true)
        {
            List<TreeNode> nextLevel = new ArrayList<>();
            List<Integer> levelVal = new ArrayList<>();
            for(TreeNode chicken:level)
            {
                levelVal.add(chicken.val);
            }
            outer.add(levelVal);
            for(TreeNode cur:level)
            {
                if(cur.left!=null)
                nextLevel.add(cur.left);
                if(cur.right!=null)
                nextLevel.add(cur.right);
            }
            level=nextLevel;
            if (nextLevel.isEmpty()) break;
        }
        return outer;
    }
}
