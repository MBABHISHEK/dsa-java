int solution(int[] nums) {
 int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }

        // dp[i] represents the maximum amount of money that can be robbed up to house i
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            // The maximum amount of money at house i is the maximum of either
            // 1. The amount of money robbed at house i-1 (dp[i-1])
            // 2. The amount of money robbed at house i-2 plus the money at house i (dp[i-2] + nums[i])
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n - 1];
}
