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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        Queue<Pair<TreeNode,Integer>> queue=new LinkedList<>();
        queue.add(new Pair<>(root,0));
        int maxWidth=0;
        while(!queue.isEmpty())
        {
            int levellength=queue.size();
            int levelstart=queue.peek().getValue();
            int index=0;

            for(int i=0;i<levellength;i++)
            {
                Pair<TreeNode,Integer>pair=queue.poll();
                TreeNode node=pair.getKey();
                index=pair.getValue();
                if(node.left!=null)
                {
                    queue.add(new Pair<>(node.left,2*index));
                }
                 if(node.right!=null)
                {
                    queue.add(new Pair<>(node.right,2*index+1));
                }
            }
            maxWidth=Math.max(maxWidth,index-levelstart+1);

        }
        return maxWidth;
    }
}
