//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long []res=new long[n];
        Stack<Integer> stack=new Stack<>();
        
        
        for(int i=0;i<n;i++)
        {
            while(stack.size()!=0&&arr[stack.peek()]<arr[i])
            {
                res[stack.pop()]=arr[i];
                
            }
            stack.push(i);
        }
        
        while(stack.size()!=0)
        {
            res[stack.pop()]=-1;
                
        }
        return res;
        
        /* this is brute force method of solving
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    res[i]=arr[j];
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                res[i]=-1;
            }
        }
        return res;*/
    } 
}
