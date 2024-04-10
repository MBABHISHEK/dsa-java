class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            count++;
        }
        max=count;
        for(int i=k;i<s.length();i++)
        {
            char c=s.charAt(i-k);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            count--;
            c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            count++;
            max=Math.max(max,count);
            if(max==k)
            return k;
        }
        return max;
    }
}
