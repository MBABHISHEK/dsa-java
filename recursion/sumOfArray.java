class SumOfArray{
    int sum(int n,int []arr) {
        if (n == 1) // Base case: if n equals 0, return 0th element
            return arr[0];
        else
            // Recursive case: return arr[n-1] plus the sum of the (n-1) arr elements
            return arr[n-1]+ sum(n - 1,arr);
    }
}
