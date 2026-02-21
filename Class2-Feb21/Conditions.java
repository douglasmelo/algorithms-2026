public class Conditions {
    public static void main(String[] args) {
        System.out.println("--- if-else Statement ---");
        int score = 85;

        System.out.println("Score is: " + score);
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
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

        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status: " + status);
    }
}
