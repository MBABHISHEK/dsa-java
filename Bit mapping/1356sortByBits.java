class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert the input array to an array of Integer objects for sorting
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Create a custom comparator for sorting based on bit counts and numerical values
        Comparator<Integer> comparator = new BitCountComparator();

        // Sort the array using the custom comparator
        Arrays.sort(nums, comparator);

        // Convert the sorted Integer array back to a primitive int array
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
}

class BitCountComparator implements Comparator<Integer> {
    private int findBitCount(int num) {
        // Count the number of set bits (1s) in the binary representation of num
        int count  = 0;

        while (num > 0) {
            count ++;
            num &= (num - 1);
        }

        return count ;
    }

    @Override
    public int compare(Integer a, Integer b) {
        int bitCountA = findBitCount(a);
        int bitCountB = findBitCount(b);

        if (bitCountA == bitCountB) {
            return a - b; // If bit counts are the same, compare numerically.
        }

        return bitCountA - bitCountB; // Sort by the bit count in ascending order.
    }
}
