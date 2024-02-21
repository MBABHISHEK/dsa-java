class Fibonacci {
    int fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n <= 1)
            return n;
        // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
