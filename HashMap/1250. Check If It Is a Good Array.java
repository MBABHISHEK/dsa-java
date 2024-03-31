class Solution {
    public boolean isGoodArray(int[] nums) {
    
    int result=nums[0];

    for(int i=1;i<nums.length;i++)
    {
      if(result==1)
        return true;
        else
        result=gcd(result,nums[i]);
    }

    if(result==1)
    return true;
    
    return false;

    }

    public int gcd(int a,int b)
    {
        if(b==0)
        return a;

        if(a>b)
        return gcd(b,a%b);
        else
        return gcd(a,b%a);
    }
}
