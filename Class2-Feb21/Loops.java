public class Loops {
    public static void main(String[] args) {
//        int i = 1;
//        System.out.println("Value of i variable: " + i);
//
//        i = i + 1;
//        System.out.println("Value of i variable: " + i);
//
//        i++; //i = i + 1;
//        System.out.println("Value of i variable: " + i);

        System.out.println("--- For Loop ---");
        // Typically used when the number of iterations is known
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop iteration: " + i);
        }

        System.out.println("\n--- While Loop ---");
        // Typically used when the number of iterations is unknown, depends on a
        // condition
        int count = 1;
        while (count <= 6) {
            System.out.println("While loop iteration: " + count);
            count++;
        }

        System.out.println("\n--- Do-While Loop ---");
        // Guarantees at least one execution before checking the condition
        int doCount = 1;
        do {
            System.out.println("Do-While loop iteration: " + doCount);
            doCount++;
        } while (doCount <= 3);

        System.out.println("\n--- Enhanced For Loop (For-Each) ---");
        // Used to iterate over arrays or collections easily
        // {} curly brackets
        // [] Square Brackets
        int[] numbers = { 10, 20, 30 };
        for (int number : numbers) {
            System.out.println("Enhanced for loop value: " + number);
        }
    }
}
