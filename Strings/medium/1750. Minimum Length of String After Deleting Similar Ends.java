class Solution {
    public int minimumLength(String s) {
        
        int r=s.length()-1;
        int count=s.length();
        int l=0;
        while(l<r&&s.charAt(l)==s.charAt(r))
        {
            char ch=s.charAt(l);
            while(l<=r&&s.charAt(l)==ch)
            {
              l++;
            }
            while(l<=r&&s.charAt(r)==ch)
            {
              r--;
            }
        }
        return r-l+1;
    }
}
