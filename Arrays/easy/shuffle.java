class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int [2*n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            a[j]=nums[i];
            a[j+1]=nums[n+i];
            j+=2;
        }
        return a;
    }
}
