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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path=new ArrayList<>();
        List<Integer> curPath=new ArrayList<>();
        dfs(root,path,curPath);
        return path;
    }
    private void dfs(TreeNode root,List<String> paths,List<Integer> curPath)
    {
        curPath.add(root.val);
        if(root.left==null && root.right==null)
        {
            paths.add(pathToString(curPath));
        }
        if(root.left!=null)
        {
            dfs(root.left,paths,curPath);
        }
        if(root.right!=null)
        {
            dfs(root.right,paths,curPath);
        }
        curPath.remove(curPath.size() - 1);
    }
    private String pathToString(List<Integer> path)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(""+path.get(0));
        for(int i=1;i<path.size();i++)
        {
            sb.append("->"+path.get(i));
        }
        return sb.toString();
    }
}
