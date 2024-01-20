class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int a = Math.max(rec1[0], rec1[2]);
        int b = Math.max(rec2[0], rec2[2]);
        int c = Math.min(rec1[0], rec1[2]);
        int d = Math.min(rec2[0], rec2[2]);

        int e = Math.max(rec1[1], rec1[3]);
        int f = Math.max(rec2[1], rec2[3]);
        int g = Math.min(rec1[1], rec1[3]);
        int h = Math.min(rec2[1], rec2[3]);

        if(a <=d || b <= c)
        {
        return false;
        }
        else
        { 
            if( e <=h || f<= g)
            {
            return false;
            }
            else
            {
            return true;
            }
        }
    
    }
}
