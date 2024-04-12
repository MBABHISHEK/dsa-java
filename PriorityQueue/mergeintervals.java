//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Pair{
    int start;
    int end;
    Pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}
class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            new Comparator<Pair> ()
            {
                public int compare(Pair a,Pair b)
                {
                    return a.start-b.start;
                }
            });
        
        for(int i=0;i<Intervals.length;i++)
        {
            pq.add(new Pair(Intervals[i][0],Intervals[i][1]));
        }
        ArrayList<Pair> arr=new ArrayList<>();
        while(!pq.isEmpty())
        {
            Pair val=pq.poll();
            if(pq.isEmpty())
            {
                arr.add(new Pair(val.start,val.end));
                break;
            }
            if(val.end>=pq.peek().end)
            {
                pq.poll();
                pq.add(val);
            }
            else
            {
                if(val.end>=pq.peek().start)
                {
                    Pair newEle=new Pair(val.start,pq.peek().end);
                    pq.poll();
                    pq.add(newEle);
                }
                else
                {
                    arr.add(val);
                }
            }
        }
        int ans[][]=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++)
        {
            ans[i][0]=arr.get(i).start;
            ans[i][1]=arr.get(i).end;
        }
        return ans;
    }
}
