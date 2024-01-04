import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        // Create a HashMap to store the frequency of each element in 'nums'
        Map<Integer, Integer> mp = new HashMap<>();
        
        // Count the frequency of each element in 'nums'
        for (int num : nums) {
            // Put the element in the map and increment its count by 1
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        
        // Initialize a variable to count the minimum operations needed
        int count = 0;
        
        // Iterate through the entries in the HashMap
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            // Get the frequency count of the current element
            int t = entry.getValue();
            
            // If there is only one occurrence of any element, it's not possible to make it divisible by 3
            if (t == 1)
                return -1;
            
            // Calculate the number of operations needed to make the frequency divisible by 3
            count += t / 3; // Count the complete sets of 3 elements
            if (t % 3 != 0) // If there are remaining elements, increment the count
                count++;
        }
        
        // Return the total count of operations needed
        return count;
    }
}

