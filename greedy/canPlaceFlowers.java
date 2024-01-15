class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int leftPointer = 0;
        int currentPointer = flowerbed[0];
        int count=0;
        for (int rightPointer = 1; rightPointer < flowerbed.length; rightPointer++) {
            if (currentPointer== 0 && currentPointer == leftPointer && currentPointer==flowerbed[rightPointer]) {
                count++;
                leftPointer=1;
            }else{
                leftPointer=currentPointer;
            }
            currentPointer=flowerbed[rightPointer];
        }
        if(leftPointer==0 && leftPointer==currentPointer){
            count++;
        }
        return count>=n;
    }
}
