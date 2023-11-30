import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minimumParentheses(String pattern) {
		// Write your code here.

		Stack <Character> s=new Stack<>();
		int count=0;
		for(int i=0;i<pattern.length();i++)
		{
		   if(pattern.charAt(i) =='(')
		   s.push('(');
		   else
		   {
			   if(s.isEmpty())
			   {
                  count++;   
			   }
			   else
			   {
				   s.pop();
			   }
		   }
		}
		return count+s.size();
	}
}
