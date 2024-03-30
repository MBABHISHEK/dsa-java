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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> M=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            M.put(inorder[i],i);
        }
        return treeCreater(preorder,M,0,0,inorder.length-1);
    }
    public TreeNode treeCreater(int []preorder,Map<Integer,Integer> M,int pix,int ileft,int iright)
    {
        int rval=preorder[pix];
        int imid=M.get(rval);
        TreeNode root=new TreeNode(rval,null,null);
        if(imid>ileft)
        root.left=treeCreater(preorder,M,pix+1,ileft,imid-1);
        if(imid<iright)
        root.right=treeCreater(preorder,M,pix+imid-ileft+1,imid+1,iright);
        return root;
    }
}
