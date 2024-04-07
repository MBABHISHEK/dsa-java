class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            // Check if char = '(', push its index into stack open
            if (ch == '(')
            {
                open.push(i);
            } else 
            // Check if char = '*', push its index into stack star
            if (ch == '*')
            {
                star.push(i);
            } else 
            if (ch == ')')
            {
                // Check if open stack is not empty, pop  from open
                if (!open.isEmpty())
                {
                    open.pop();
                } else 
                // If open is empty, Check if star is not empty, pop from star
                if (!star.isEmpty())
                {
                    star.pop();
                } else 
                // If both are empty, return false 
                {
                    return false;
                }
            }
        }
 
        // Check for any leftovers 
        // Check if any element is still present in open 
        while (!open.isEmpty())
        {
            // If star is empty, s is invalid, return false 
            if (star.isEmpty())
            {
                return false;
            } else 
            // Check if top index in open < top index in star 
            if (open.peek() < star.peek())
            {
                // pop from both open and star 
                open.pop();  
                star.pop();
            } else 
            // If top index in open > top index in star, s is invalid
            {
                return false;
            }
        }
        return true;
    }
}
