class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
    public int atMostK(int []arr,int k)
    {
        int n=arr.length;
        int ans=0;
        int left=0;
        int count=0;
        for(int right=0;right<n;right++)
        {
            if(arr[right]%2!=0)
            {
                count++;
            }
            while(left<=right&&count>k)
            {
                if(arr[left++]%2!=0)
                count--;
            }

            ans+=right-left+1;
        }
        return ans;
    }
}
