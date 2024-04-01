class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> intervalList=new ArrayList<>();
        for(int [] interval:intervals)
        {
            intervalList.add(interval);
        }
        intervalList.add(newInterval);
        Collections.sort(intervalList,(a,b)->Integer.compare(a[1],b[1]));
        List<int []> res=new ArrayList<>();
        res.add(intervalList.get(0));
        for(int i=1;i<intervalList.size();i++)
        {
            int currStart=intervalList.get(i)[0];
            int currend=intervalList.get(i)[1];
            while(res.size()>0&&res.get(res.size()-1)[1]>=currStart)
            {
             currend=Math.max(currend,res.get(res.size()-1)[1]);
             currStart=Math.min(currStart,res.get(res.size()-1)[0]); 
             res.remove(res.size()-1);  
            }
            res.add(new int[]{currStart,currend});
        }
        return res.toArray(new int[res.size()][]);
    }
}
