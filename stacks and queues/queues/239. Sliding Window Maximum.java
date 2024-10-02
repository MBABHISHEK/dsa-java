class Solution {
    public int getMax(int []arr,int left,int right)
    {
       int max=Integer.MIN_VALUE;
        for(int i=left;i<=right;i++)
            max=Math.max(max,arr[i]);
        return max;
    }
      public int[] bruteForceMaxSlidingWindow(int[] nums, int k)
    {
        if(nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int left=0;
        int right=k-1;
         int[] result = new int[n - k + 1];
        while(right<nums.length)
        {
            result[left]=getMax(nums,left,right);
            left++;
            right++;
        }
        return result;
    }
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int n=nums.length;
        int [] result=new int[n-k+1];
        Deque<Integer> deque=new LinkedList<>();
        int ri=0;
        for(int i=0;i<n;i++)
        {
            if(!deque.isEmpty()&&deque.peekFirst()<i-k+1)
            {
                deque.pollFirst();
            }

            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i])
            {
                deque.pollLast();
            }
            deque.offer(i);

            if(i>=k-1)
            {
                result[ri]=nums[deque.peekFirst()];
                ri++;
            }
        }
        return result;
    }
}
