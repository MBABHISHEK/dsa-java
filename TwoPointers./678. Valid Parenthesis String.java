class Solution {
    public boolean checkValidString(String s) {
        int star=0;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*'){
                star++;
               
            }
           if(s.charAt(i)=='(')
           {
            left++;
           }
           if(s.charAt(i)==')')
           {
              
              if(left>0)
              {
                left--;
              }
              else if(star>0)
              {
                    star--;
              }
                else
                {
                    return false;
                }
              }
             
           
        }
        star=0;
          for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='*'){
                star++;
               
            }
           if(s.charAt(i)==')')
           {
              right++;
           }
           if(s.charAt(i)=='(')
           {
              
              if(right>0)
              {
                right--;
              }
              else if(star>0)
              {
                    star--;
                }
              
              else{
                return false;
              }
             
           }

        }
  System.out.println(star);
   System.out.println(left);
    System.out.println(right);
   return true;
   //return false;
    }
}
