import java.util.ArrayList;
import java.util.Collections;
public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        
        // Check if the ArrayList is empty or rotation is not needed
        if (n <= 1 || k % n == 0) {
            return arr;
        }

        // Calculate the effective rotation
           int rotations = n - (k % n);

         Collections.rotate(arr, rotations);

        return arr;


    }
}
