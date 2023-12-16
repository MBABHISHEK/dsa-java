class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1)
         return;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
       {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int count=0;
       int j=0;
       for(int i=0;i<3;i++)
       {
           count=map.getOrDefault(i,0);
           while(count>0)
           {
               nums[j]=i;
               j++;
               count--;
           }
       }
    }
}
