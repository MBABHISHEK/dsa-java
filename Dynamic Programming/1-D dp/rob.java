class Solution {
    public int memo(int i,int[] nums,int[] dp){
        if(i<0)return 0;
        if(i==0){
            return nums[i];
        }
        if(dp[i]!=-1)return dp[i];
        
        int pick=nums[i]+memo(i-2,nums,dp);
        int notPick=memo(i-1,nums,dp);
        
        return dp[i]=Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n-1,nums,dp);
    }

}
