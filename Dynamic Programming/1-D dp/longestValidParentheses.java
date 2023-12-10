class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_length=0;

        for(int i=0;i<s.length();i++)
        {
            char cr=s.charAt(i);
            if(cr == '(')
              stack.push(i);
              else
              {
                  stack.pop();
                  if(stack.isEmpty())
                  {
                      stack.push(i);
                  }
                  else
                  max_length=Math.max(max_length,i-stack.peek());
              }
        }
        return max_length;
        
    }
}
