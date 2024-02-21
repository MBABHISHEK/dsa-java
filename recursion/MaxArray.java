class MaxArray {
    int findMax(int n, int[] arr) {
        if (n == 1)
            return arr[0];
        int maxi = findMax(n - 1, arr); // Find maximum of subarray from index 0 to n-1
        return Math.max(maxi, arr[n - 1]); // Compare maximum of subarray with arr[n-1] and return the larger one
    }
}
