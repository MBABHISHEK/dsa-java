import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		HashMap<Character,Integer> map=new HashMap<>();
        int right=0;
		int left=0;
		int n=input.length();
		int maxi=Integer.MIN_VALUE;
		while(right<n)
		{
			if(map.containsKey(input.charAt(right)))
			{
				left=Math.max(left,map.get(input.charAt(right))+1);
			}
			map.put(input.charAt(right),right);
		    maxi=Math.max(maxi,right-left+1);
			right++;
		}
		return maxi;
	}
}
