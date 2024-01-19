class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> t=new ArrayList<Boolean>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++)
        {
              if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            t.add(true);
            else
            t.add(false);
        }
        return t;
    }
}
