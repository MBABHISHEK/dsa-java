class Solution {
    public boolean canJump(int[] nums) {
        
         if(nums.length == 1) 
          return true;
         int max=0;
         int n=nums.length;

        for (int i=0;i<n-1&&i<=max;i++) {
            max=Math.max(max,nums[i]+i);

                if(max>=n-1) 
                return true;
        }

        return false;
    }
}
