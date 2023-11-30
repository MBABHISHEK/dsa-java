import java.util.* ;
import java.io.*; 
public class Solution {
	public static String removeVowels(String str) {


		StringBuilder result=new StringBuilder();
         
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i))==0)
			result.append(str.charAt(i));

		}

		return result.toString();
	 // Write your code here.
	}

	static int isVowel(char c)
	{
       	if("aeiouAEIOU".indexOf(c) != -1)
            return -1;

		return 0;	
	}
}
