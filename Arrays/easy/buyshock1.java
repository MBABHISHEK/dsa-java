class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int minprice=prices[0];
        int max=0;
        for(int i=1;i<n;i++)
        {
           minprice=Math.min(minprice,prices[i]);
           max=Math.max(max,prices[i]-minprice);

        }
        return max;
    }
}
