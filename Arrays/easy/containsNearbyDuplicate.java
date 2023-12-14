class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

         int n=nums.length;   
         /* thid is bruteforce approach
        for(int i=0;i<n-1;i++)
        {
                if(nums[i]==nums[j+1])
                  if(k>=Math.abs(i-j))
                   return true;

        }
        return false;
        */

        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(i>k)
                s.remove(nums[i-k-1]);
             if(!s.add(nums[i]))
                return true;   
        }
        return false;
    }
}
