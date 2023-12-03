class Solution {
    public int[] twoSum(int[] numbers, int target) {
/* brutte force approach*/
        int sum;
        int [] arr=new int[2];
        int n=numbers.length;
        int i,j;
        for(i=0;i<n-1;i++)
        {
            sum=numbers[i];
            arr[0]=i+1;
           for(j=i+1;j<n;j++)
           {
              if(sum+numbers[j]==target)
                {
                  sum+=numbers[j];
                  arr[1]=j+1;
                  break;
                }
           }
           if(sum==target)
                {
                  break;
                }
        }
        return arr;
    }
}
