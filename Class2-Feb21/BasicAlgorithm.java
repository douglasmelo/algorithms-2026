public class BasicAlgorithm {
    public static void main(String[] args) {
        System.out.println("--- Basic Algorithm: Find Maximum in Array ---");

        // An array of test numbers
        int[] numbers = { 45, 12, 85, 32, 89, 39, 69, 44 };
        // numbers[0] = 45;
        // numbers[1] = 12;
        // numbers[2] = 85;
        // numbers[3] = 32;
        // numbers[4] = 89;
        // numbers[5] = 39;
        // numbers[6] = 69;
        // numbers[7] = 44;

        // Ensure the array is not empty to avoid errors
        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize max with the first element of the array
        // <type> <variable name> = <variable value>;
        int max = numbers[0];

        // Loop through the rest of the array starting from index 1
        for (int i = 1; i < numbers.length; i++) { // i=8, numbers[i]=44, max=89
            System.out.println("i=" + i + ", numbers[i]=" + numbers[i] + ", max=" + max);
            // If we find a number bigger than our current max, update max
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nMaximum value found: " + max);
    }
}
