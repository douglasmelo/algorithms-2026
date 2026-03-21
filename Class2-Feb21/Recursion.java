import java.math.BigInteger;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("--- Recursion Examples ---");

        // Example 1: Factorial
        int num = 5;
        // int num = 12000;
        // 5 * 4 (n-1) * 3 * 2 * 1 = 120
        // 5 * 4 * 3 * 2 * 1 = 120
        // 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040
        // 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 3628800
        // 41 * 40 * 39 * ... * 1 = 3628800
        System.out.println("Factorial of " + num + " is: " + factorial(num));

        // Example 2: Fibonacci
        int n = 6;
        // int n = 19;
        System.out.println("Fibonacci number at position " + n + " is: " +
                fibonacci(n));

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
    public static BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE; // Base case
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1)); // Recursive step
    }

    // Stack trace:
    // 5 * factorial(5 - 1) // first iteraction -- 5 * 24 = 120
    // 4 * factorial(4 - 1) // second iteraction -- 4 * 6 = 24
    // 3 * factorial(3 - 1) // third iteraction -- 3 * 2 = 6
    // 2 * factorial(2 - 1) // fourth iteraction -- 2 * 1 = 2
    // 1 return 1 // fifth iteraction
    // 2 * 1 = 2 // sixth iteraction
    // 3 * 2 = 6 // seventh iteraction
    // 4 * 6 = 24 // eighth iteraction
    // 5 * 24 = 120 // ninth iteraction

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

    // Stack trace:
    // fibonacci(6) -> fibonacci(5) + fibonacci(4) // 5 + 3 = 8
    // fibonacci(5) -> fibonacci(4) + fibonacci(3) // 3 + 2 = 5
    // fibonacci(4) -> fibonacci(3) + fibonacci(2) // 2 + 1 = 3
    // fibonacci(3) -> fibonacci(2) + fibonacci(1) // 1 + 1 = 2
    // fibonacci(2) -> fibonacci(1) + fibonacci(0) // 1 + 0 = 1
    // fibonacci(1) -> 1
    // fibonacci(0) -> 0

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

    // Stack trace:

    // int[] arr = { 1, 2, 3, 4, 5 };
    // arr= [1, 2, 3, 4, 5] // values
    // arr= [0, 1, 2, 3, 4] //indexes

    // sumArray({1, 2, 3, 4, 5}, 5) -> sumArray({1, 2, 3, 4, 5}, 4) + 5 // 10 + 5 =
    // 15
    // sumArray({1, 2, 3, 4, 5}, 4) -> sumArray({1, 2, 3, 4, 5}, 3) + 4 // 6 + 4 =
    // 10
    // sumArray({1, 2, 3, 4, 5}, 3) -> sumArray({1, 2, 3, 4, 5}, 2) + 3 // 3 + 3 = 6
    // sumArray({1, 2, 3, 4, 5}, 2) -> sumArray({1, 2, 3, 4, 5}, 1) + 2 // 1 + 2 = 3
    // sumArray({1, 2, 3, 4, 5}, 1) -> sumArray({1, 2, 3, 4, 5}, 0) + 1 // 0 + 1 = 1
    // sumArray({1, 2, 3, 4, 5}, 0) -> 0

    // sumArray({1, 2, 3, 4, 5}, 1) -> sumArray({1, 2, 3, 4, 5}, 0) + 1

    // sumArray({1, 2, 3, 4, 5}, 0) -> sumArray({1, 2, 3, 4, 5}, -1) + 1

    // sumArray({1, 2, 3, 4, 5}, 1) -> sumArray({1, 2, 3, 4, 5}, 0) + arr[1] = 1 + 2
    // = 3
    // sumArray({1, 2, 3, 4, 5}, 2) -> sumArray({1, 2, 3, 4, 5}, 1) + arr[2] = 3 + 3
    // = 6
    // sumArray({1, 2, 3, 4, 5}, 3) -> sumArray({1, 2, 3, 4, 5}, 2) + arr[3] = 6 + 4
    // = 10
    // sumArray({1, 2, 3, 4, 5}, 4) -> sumArray({1, 2, 3, 4, 5}, 3) + arr[4] = 10 +
    // 5 = 15
}
