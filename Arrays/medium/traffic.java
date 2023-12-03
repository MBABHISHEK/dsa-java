public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
       int maxTraffic = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < vehicle.length; right++) {
            if (vehicle[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > m) {
                if (vehicle[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxTraffic = Math.max(maxTraffic, right - left + 1);
        }

        return maxTraffic;  
    }
}
