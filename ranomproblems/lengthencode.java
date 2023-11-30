import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String message) {
		// Write your code here.
		StringBuilder result=new StringBuilder();

		int count=1;

		for(int i=0;i<message.length()-1;i++)
		{
			if(message.charAt(i)==message.charAt(i+1))
			  count++;
			 else
			 {
				result.append(message.charAt(i)).append(count);
                count = 1; 
			 } 
		}
		
         result.append(message.charAt(message.length() - 1)).append(count);
		 return result.toString();
	}
}
