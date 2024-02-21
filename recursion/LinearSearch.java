class LinearSearch {
    int linearSearch(int[] arr, int key, int n) {
        if (n == 0) // Base case: if n equals 0, it means the array is empty, and the key is not found
            return -1;
        else if (arr[n - 1] == key) // Check if the key is found at index n - 1
            return n - 1; // Return the index of the key
        else
            return linearSearch(arr, key, n - 1); // Recursively search in the subarray excluding the last element
    }
}
