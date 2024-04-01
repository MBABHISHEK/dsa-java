class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count=0;
        int [] diff=new int[capacity.length];
        for(int i=0;i<capacity.length;i++)
        {
            diff[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(diff);
        for(int i=0;i<capacity.length;i++)
        {
           if(diff[i]==0)
           continue;
           else if(diff[i]<=additionalRocks)
           {
                additionalRocks-=diff[i];
                diff[i]=0;
           }
           else
           {
            break;
           }
        }

        for(int i=0;i<capacity.length;i++)
            if(diff[i]==0)count++;
        return count;
    }
}
