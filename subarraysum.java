//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
          
          ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int sum=0;
        for(int end=0;end<n;end++)
        {
            sum=sum+arr[end];
            while(s<sum)
            {
                sum=sum-arr[start];
                start++;
            }
            if (sum == s&&start<=end) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }
    
            result.add(-1);
        return result;
    }







        /*int sum,flag=0;
          ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            sum=arr[i];
            if(sum==s)
                {
                    flag=1;
                    a.add(i+1);
                    a.add(i+1);
                    break;
                }
                
            for(int j=i+1;j<n;j++)
            {
        
                sum+=arr[j];
                if(sum>s)
                break;
         
                if(sum==s)
                {
                    flag=1;
                    a.add(i+1);
                    a.add(j+1);
                    break;
                }
                
            }
            if(flag==1)
            break;
        }
            
        if(flag==0)
        a.add(-1);
    
        return a;*/
}
