import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) 
	{
		
		if (n <= 1)
		{
        return n;
        }

    // Initialize a variable to keep track of the position to overwrite duplicates
    int index = 0;

    // Iterate through the ArrayList starting from the second element
    for (int i = 1; i < n; i++) {
        // Check if the current element is different from the previous one
        if (!arr.get(i).equals(arr.get(index))) {
            // If different, overwrite the next position with the current element
            index++;
            arr.set(index, arr.get(i));
        }
    }

    // The size of the ArrayList after removing duplicates is index + 1
    return index + 1;
		// Write your code here.
	}
}
