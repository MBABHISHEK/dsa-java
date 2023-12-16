/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result=new ArrayList<>();
        postraversal(root,result);
        return result;
    }

    private void postraversal(Node root,List<Integer> result)
    {
        if(root==null)
         return;
         List<Node> child=root.children;
         for(Node temp:child)
         {
             postraversal(temp,result);
         }
         result.add(root.val);

    }
}
