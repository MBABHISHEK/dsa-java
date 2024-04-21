/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int num=0,middle=0;
        int start=1,end=n;
        while(start<=end)
        {
            middle=start+(end-start)/2;
            if(isBadVersion(middle))
            {
                num=middle;
                end=middle-1;
            }
            else
            {
                start=middle+1;
            }
        }
        return num;
    }
}
