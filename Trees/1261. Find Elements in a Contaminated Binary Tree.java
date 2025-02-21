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
class FindElements {
    TreeNode groot;
    public FindElements(TreeNode root) {
        if(root!=null&&root.val==-1)
        {
            root.val=0;
        }
        solve1(root);
        groot=root;
    }
    void solve1(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left!=null)
        {
            root.left.val=2*root.val+1;
        }
         if(root.right!=null)
        {
            root.right.val=2*root.val+2;
        }
        solve1(root.left);
        solve1(root.right);
    }
    public boolean find(int target) {

        TreeNode node=new TreeNode();
        node=groot;
        return solve2(node,target);
    }

    public boolean solve2(TreeNode node,int target)
    {
        if(node==null)
        {
            return false;
        }
        if(node.val==target)
        {
            return true;
        }
        return solve2(node.left,target)||solve2(node.right,target);
    } 
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
