class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g) ;
        Arrays.sort(s) ;
        int count = 0 ;

        // two pointer approach

        int i = 0 ;
        int j = 0 ; 

        while ( i <= g.length - 1 &&  j <= s.length - 1 ) {
            if (s[j] >= g[i] ) {
                // satisifies the greed
                count++ ;
                i++ ;
                j++ ;
            }
            else {
                j++ ;
            }
        }
        return count ;
    }
}
