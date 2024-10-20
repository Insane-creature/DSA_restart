package Recursion;

class CubicSum {
    static long sumOfSeries(long n) {
        if (n < 1) {
            return 0; // Base case: return 0 for n < 1
        }
        long sum = n * n * n; // Calculate n^3
        sum += sumOfSeries(n - 1); // Add the result of the recursive call
        return sum; // Return the total sum
    }

    public static void main(String[] args) {
        long n = 5; // Use long to match the method signature
        System.out.println(sumOfSeries(n)); // Output the result
    }
}
