import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

         while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            result.add(a[i]);
            i++;
        }

        while (j < b.length) {
            result.add(b[j]);
            j++;
        }
            
             for (int k = 1; k < result.size(); k++) {
            if (result.get(k).equals(result.get(k - 1))) {
                result.remove(k);
                k--;
            }
        }
        return result;

    }
}
