class Solution {
    public int[] twoSum(int[] numbers, int target) {

        /*with two pointer approach */
        int l=0;
        int r=numbers.length-1;

        while(numbers[l]+numbers[r]!=target)
        {
            if(numbers[l]+numbers[r]>target)
             r--;
             else
             l++;
        }
        return new int[]{l+1,r+1};
    }
}
