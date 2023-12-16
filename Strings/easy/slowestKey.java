class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        int max=0;
        int n=releaseTimes.length;
        int maxi=0;
        int res=0;
        int curtime=0;
        for(int i=0;i<n;i++)
        {
           res=releaseTimes[i]-curtime;
           curtime=releaseTimes[i];
            if(max<res || (res == max && keysPressed.charAt(i) > keysPressed.charAt(maxi)))
            {
                maxi=i;
                max=res;
            }
        }
        return keysPressed.charAt(maxi);
    }
}
