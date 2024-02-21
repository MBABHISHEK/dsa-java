class MeanArray {
    float mean(int[] arr, int n) {
        if (n == 1)
            return (float)arr[0];
        else
            return ((float)mean(arr, n - 1) * (n - 1) + arr[n - 1]) / n; // corrected the parenthesis
    }
}
