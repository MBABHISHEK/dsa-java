class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int left=0;
        int subcount=0;
        int sum=0;
        for(int right=0;right<arr.length;right++)
        {
            sum+=arr[right];
            subcount++;
            if(sum>=(threshold*k)&&subcount==k)
            {
              count++;
            }
            if(subcount==k)
            {
                subcount--;
                sum-=arr[left];
                left++;
                
            }
        }
        return count;
    }
}
