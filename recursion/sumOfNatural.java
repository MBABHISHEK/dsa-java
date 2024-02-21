class SumOfNatural {
    int sum(int n) {
        if (n == 0) // Base case: if n equals 0, return 0
            return 0;
        else
            // Recursive case: return n plus the sum of the first (n-1) natural numbers
            return n + sum(n - 1);
    }
}
