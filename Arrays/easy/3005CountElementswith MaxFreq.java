class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxFre=Integer.MIN_VALUE;
        for(int fre:map.values())
        {
            maxFre=Math.max(fre,maxFre);
        }
        int count=0;
        for(int fre:map.values())
        {
            if(fre==maxFre)
            count+=maxFre;
        }

        return count;
    }
}
