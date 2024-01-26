class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int oddIndexChange = 0, evenIndexChange = 0;
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i-1 >= 0 && nums[i] >= nums[i-1] ||
                i+1 < n && nums[i] >= nums[i+1]) {
                    int min = Integer.MAX_VALUE;
                    if (i+1 < n)
                        min = Math.min(nums[i+1],min);
                    if (i-1 >= 0)
                        min = Math.min(nums[i-1],min);
                    int cost = nums[i]-min+1;
                    if (i%2 == 0)
                        evenIndexChange += cost;
                    else 
                        oddIndexChange += cost;
            }
        }
        return Math.min(oddIndexChange,evenIndexChange);
    }
}
