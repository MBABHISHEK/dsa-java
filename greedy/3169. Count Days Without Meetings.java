class Solution {
    public int countDays(int days, int[][] meetings) {

        /* this is the brute force solution 
        boolean [] visited=new boolean[days];

        for(int [] range:meetings)
        {
            for(int j=range[0];j<=range[1];j++)
            {
                visited[j-1]=true;
            }
        }

        int cnt=0;
        for(boolean day:visited)
        {
            if(!day)
            cnt++;
        }
        return cnt;*/

        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int unvisited=0;
        int temp=1;
        for(int [] m:meetings)
        {
            unvisited+=Math.max(0,m[0]-temp);
            temp=Math.max(temp,m[1]+1);
            if(temp>days)
            {
                break;
            }
        }

        return unvisited+Math.max(0,days-temp+1);
    }
}
