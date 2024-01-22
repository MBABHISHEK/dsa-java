import java.util.Collections;
import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> typeCandySet = new HashSet<>();
        int halfLength = candyType.length / 2;

        for (int c : candyType) {
            if (typeCandySet.size() >= halfLength)
                return halfLength;
            typeCandySet.add(c);
        }
        return Math.min(typeCandySet.size(), halfLength);
    }
}
