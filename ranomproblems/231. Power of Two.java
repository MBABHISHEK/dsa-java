class Solution {
    public boolean isPowerOfTwo(int n) {
    
    int ans;
    for(int i=0;i<31;i++)
    {
         ans=(int)Math.pow(2,i);

         if(ans==n)
          return true;
    }   

    return false;
    }
}



with recursion 
class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1) {
            return false;
        }
        return isPowerOfTwo(n / 2);
        
    }
}
