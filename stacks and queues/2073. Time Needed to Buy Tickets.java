class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;
        for(int i=0;i<tickets.length;i++)
        {
            if(i<=k)
            {
                total+=Math.min(tickets[i],tickets[k]);
            }
            else
            {
                total+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        /*Brute force solution
        while(tickets[k]!=0)
        {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i]!=0)
                {
                 total++;
                 tickets[i]--;
                }
                if(tickets[k]==0)
                break;
            }
        }*/
        return total;
    }
}
