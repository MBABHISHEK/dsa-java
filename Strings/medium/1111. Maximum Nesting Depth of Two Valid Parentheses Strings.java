class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depth=-1;
        int i=0;
        int ln=seq.length();
        int [] a=new int[ln];
        while(i<ln)
        {
            if(seq.charAt(i)=='(')
            {
                depth++;
                a[i]=depth%2;
            }
            else
            {
                a[i]=depth%2;
                depth--;
            }
            i++;
        }
        return a;
    }
}
