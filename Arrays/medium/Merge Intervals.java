class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int totalIntervals=intervals.length;
        int intervalStart=intervals[0][0];
        int intervalEnd=intervals[0][1];
		List<int []> mergedList=new ArrayList<>();
        for(int i=1;i<totalIntervals;i++)
        {
           if(intervals[i][0]>intervalEnd)
           {
                mergedList.add(new int[] {intervalStart, intervalEnd});
                intervalStart = intervals[i][0];
                intervalEnd = intervals[i][1];
           }
           else
           {
               intervalEnd = Math.max(intervalEnd, intervals[i][1]);
           }
        }
        mergedList.add(new int[] {intervalStart, intervalEnd});
		return mergedList.toArray(new int[mergedList.size()][]);
	}
}
