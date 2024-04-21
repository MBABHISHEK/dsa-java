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
    HashMap<Integer,Integer> map=new HashMap<>();
    int max=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null)
        {
            int arr[]=new int[10];
            return arr;
        }
        findFrequentTreeSumHelper(root);
        ArrayList<Integer> arr=new ArrayList<>();
        for(Integer key : map.keySet()){
            if(map.get(key)==max){
               arr.add(key);
            }
        }
         int[] ans=new int[arr.size()];
        for(int i=0; i<ans.length; i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
    public void findFrequentTreeSumHelper(TreeNode root)
    {
        if(root==null)
        return ;
        findFrequentTreeSumHelper(root.left);
        findFrequentTreeSumHelper(root.right);
         int sum=root.val;
          if(root.left!=null){
            sum+=root.left.val;
        }
        if(root.right!=null){
            sum+=root.right.val;
        }
             if(map.containsKey(sum)){
            map.put(sum, map.get(sum)+1);
        }else{
            map.put(sum,1);
        }
        root.val=sum;
        max=Math.max(map.get(sum),max);
    }
}
