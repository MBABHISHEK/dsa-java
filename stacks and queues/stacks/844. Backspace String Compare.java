class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        if(s.charAt(0)!='#')
         stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(stack.size()>0)
                stack.pop();
            }
            else
            {
              stack.push(s.charAt(i));
            }
        }

        String s1=new String();
        while(stack.size()!=0)
        {
        s1+=stack.pop();
        }
        if(t.charAt(0)!='#')
        stack.push(t.charAt(0));
        for(int i=1;i<t.length();i++)
        {
            if(t.charAt(i)=='#')
            {
                if(stack.size()>0)
                stack.pop();
            }
            else
            {
              stack.push(t.charAt(i));
            }
        }

        String s2=new String();
        while(stack.size()!=0)
        {
        s2+=stack.pop();
        }

        if(s1.equals(s2))
        return true;

        return false;        

    }
}
