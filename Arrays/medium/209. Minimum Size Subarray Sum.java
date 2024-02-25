class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        int mini=Integer.MAX_VALUE;

        for(int j=0;j<nums.length;j++)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                sum=sum-nums[i];
                mini=Math.min(j-i+1,mini);
                i++;
            }
        }
        if(mini==Integer.MAX_VALUE)
        return 0;
        return mini;
    }
}
