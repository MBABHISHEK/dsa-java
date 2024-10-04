class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int expectedSum=skill[0]+skill[n-1];
        long totalChemistry=0;
        for(int i=0;i<(n/2);i++)
        {
            if(skill[i]+skill[n-i-1]!=expectedSum)
            {
                return -1;
            }
            totalChemistry += (long) skill[i] * skill[n - 1 - i];
        }
        return totalChemistry;
    }
}
