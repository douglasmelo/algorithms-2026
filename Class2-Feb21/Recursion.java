public class Recursion {

    public static void main(String[] args) {
        System.out.println("--- Recursion Examples ---");

        // Example 1: Factorial
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));

        // Example 2: Fibonacci
        int n = 6;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

        // Example 3: Sum of Array
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of array elements is: " + sumArray(arr, arr.length));
    }

    /**
     * Calculates the factorial of a number using recursion.
     * The factorial of n (n!) is n * (n-1) * (n-2) * ... * 1.
     * Base case: n <= 1, return 1.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive step
    }

    /**
     * Returns the n-th Fibonacci number.
     * The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8...
     * Base cases: n <= 0 returns 0, n == 1 returns 1.
     *
     * @param n the position in the Fibonacci sequence
     * @return the n-th Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0; // Base case
        } else if (n == 1) {
            return 1; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }

    /**
     * Calculates the sum of elements in an array using recursion.
     * Base case: when the number of elements (n) is 0, the sum is 0.
     *
     * @param arr the array to sum
     * @param n   the number of elements left to sum (usually starts as arr.length)
     * @return the sum of the elements
     */
    public static int sumArray(int[] arr, int n) {
        if (n <= 0) {
            return 0; // Base case
        }
        return sumArray(arr, n - 1) + arr[n - 1]; // Recursive step
    }
}
