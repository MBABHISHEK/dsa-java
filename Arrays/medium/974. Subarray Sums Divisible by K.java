class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int [] rem=new int[k];
        rem[0]=1;
        int prefixmod=0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
         prefixmod=(prefixmod+nums[i]%k+k)%k;
         result+=rem[prefixmod];
         rem[prefixmod]++;
        }
        return result;
    }
}
