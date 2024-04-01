class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int boxes=0;
        int total=0;
        int ans=0;
        int size=boxTypes.length;

        for(int i=0;i<size&&truckSize>0;i++)
        {
            boxes=Math.min(truckSize,boxTypes[i][0]);
            ans+=boxes*boxTypes[i][1];
            truckSize-=boxes;
        }
        return ans;
    }
}
