class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list=new  ArrayList<>();
         int n=nums.length;
         int start;
        for(int i=0;i<n;i++)
        {
            start=i;
              while(i+1<n&& nums[i]+1==nums[i+1])
                  i++;

              if(i!=start)
              {
                  list.add(""+nums[start]+"->"+nums[i]);
              }    
              else
              {
                   list.add(""+nums[start]);
              }

        }
        return list;
        
    }
}
