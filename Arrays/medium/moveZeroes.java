class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) 
        {
            if(nums[i] != 0) 
            {
                // Swap non-zero element with the first zero encountered
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
            
                // Move nonZeroIndex to the next position
                nonZeroIndex++;
            }
        }
    }
}
