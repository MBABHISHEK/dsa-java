class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
           sum+=nums[i];
        }
        avg=(double)sum/k;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i];
            sum-=nums[i-k];
            avg=Math.max((double)sum/k,avg);
        }
        return avg;
    }
}
