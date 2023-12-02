class Solution {
    public boolean canJump(int[] nums) {
        
         int n = nums.length;
        int lastPosition = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPosition) {
                lastPosition = i;
            }
        }

        return lastPosition == 0;
    }
}
