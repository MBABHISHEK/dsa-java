class Solution {
    public void rotate(int[] nums, int k) {

        int l=nums.length;
            if (k >= l) {
            k %= l; // Take modulo to avoid unnecessary full rotations
        }
        reverse(nums,0,l-1);
        reverse(nums,0,k-1);
        reverse(nums,k,l-1);
    }

    public static void reverse(int []nums,int start,int end)
    {
       int temp;
        while(start<=end)
           {
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
           }
    }
}
