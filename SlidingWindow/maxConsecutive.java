import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
	 	int left=0;
		 int right=0;
		 int zeros=0;
		 int maxi=Integer.MIN_VALUE;
		 while(right<arr.size())
		 {
			 if(arr.get(right)==0)
			   zeros++;
			 if(zeros>k)
			 {
				 if(arr.get(left)==0)
				  zeros--;
				 left++;
			 }
			 if(zeros<=k)
			 {
				 maxi=Math.max(maxi,right-left+1);
			 }
			 right++;
		 }
		 return maxi;
	}
}
