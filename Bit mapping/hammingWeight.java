public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        // Iterate through each bit in the integer
        while (n != 0) {
            // Increment count if the last bit is 1
            count += n & 1;
            // Right shift the integer to check the next bit
            n >>>= 1;
        }
        return count;
    }
}
