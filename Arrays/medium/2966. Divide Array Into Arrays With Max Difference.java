class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int size = nums.length;
        if (size % 3 != 0)
            return new int[0][0];

        Arrays.sort(nums);

        int[][] result = new int[size / 3][3];
        int groupIndex = 0;
        for (int i = 0; i < size; i += 3) {
            if (i + 2 < size && nums[i + 2] - nums[i] <= k) {
                result[groupIndex] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
                groupIndex++;
            } else {
                return new int[0][0]; // This line may need to be modified based on your requirements
            }
        }
        return result;
    }
}
