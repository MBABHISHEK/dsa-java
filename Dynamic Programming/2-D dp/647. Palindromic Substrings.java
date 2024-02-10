/* this is brute force method 
class Solution {
        int count1=0;
        boolean isPalindrome(String s,int i,int j)
        {
            while(i<=j)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    count1++;
                    return false;
                }
                i++;
                j--;
            }

            return true;
        }

      public int countSubstrings(String s) {
          int count=0;

          for(int i=0;i<s.length();i++)
          {
              for(int j=i;j<s.length();j++)
              {
                  if(isPalindrome(s,i,j))
                  {
                      count++;
                      if(count1==2)
                      {
                          count1=0;
                          break;
                      }
                  }
              }
          }
          return count;
    }
}*/

class Solution{
public int countSubstrings(String s) {
 int n=s.length();
 boolean[][] dp=new boolean[n][n];
 int count=0;

 for(int i=n-1;i>=0;i--)
 {
     for(int j=i;j<n;j++)
     {
         if(i==j)
         {
              dp[i][j]=true;
         }
         else if(j==i+1)
         {
             dp[i][j]=(s.charAt(i)==s.charAt(j));
         }
         else {
             dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
         }


         if (dp[i][j]) {
                    count++;
     }
     }
 }
     return count;
}

}
