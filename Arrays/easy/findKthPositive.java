class Solution {
    public int findKthPositive(int[] arr, int k) {
        
       int count = 0; // Counter for missing integers
        int current = 1; // Current positive integer

        for (int num : arr) {
            while (current < num) {
                count++;
                if (count == k) {
                    return current;
                }
                current++;
            }
            current++;
        }

        // If kth missing integer is beyond the last element of the array
        while (count < k) {
            count++;
            current++;
        }

        return current - 1; 
    }
}
