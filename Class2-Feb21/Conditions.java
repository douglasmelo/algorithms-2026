public class Conditions {
    public static void main(String[] args) {
        System.out.println("--- if-else Statement ---");
        int score = 85;

        System.out.println("Score is: " + score);
        if (score >= 90) { //>=: Greater than or equal to
            System.out.println("Grade: A"); // <- output command
        }
        else if (score >= 80) {
            System.out.println("Grade: B"); // <- output command
        }
        else if (score >= 70) {
            System.out.println("Grade: C"); // <- output command
        }
        else {
            System.out.println("Grade: F"); // <- output command
        }


        System.out.println("\n--- switch Statement ---");
        int dayOfWeek = 3;
        System.out.println("Day of week is: " + dayOfWeek);

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        System.out.println("\n--- Ternary Operator ---");
        // A shorthand for a simple if-else statement
        int age = 18;
        System.out.println("Age is: " + age);

        /*
        The general syntax for the ternary operator is as follows:
        result = (condition) ? value_if_true : value_if_false;
        condition: A boolean expression that evaluates to either true or false, much like the expression inside an if statement. Parentheses around the condition are not strictly required but are recommended for readability.
        ? (Question Mark): Separates the condition from the potential results.
        value_if_true: The expression whose result is returned if the condition is true.
        : (Colon): Separates the true result from the false result.
        value_if_false: The expression whose result is returned if the condition is false.
        */

        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status: " + status);
    }
}
