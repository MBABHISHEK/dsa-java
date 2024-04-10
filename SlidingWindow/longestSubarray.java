class Solution {
    public int longestSubarray(int[] nums) {
        int prevWindow=0;
        int currWindow=0;
        int max_length=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                max_length=Math.max(max_length,prevWindow+currWindow);
                prevWindow=currWindow;
                currWindow=0;
            }
            else
            {
                currWindow++;
            }
        }

        if (currWindow == nums.length) {
            return currWindow - 1;
        }
        max_length = Math.max(max_length, prevWindow + currWindow);
        return max_length;
    }
}
