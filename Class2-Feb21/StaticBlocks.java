public class StaticBlocks {

    // Static variable (shared among all instances of the class)
    public static String staticMessage;

    // Instance variable
    public String instanceMessage;

    // Static initialization block
    // Runs exactly ONCE when the class is loaded into memory, before any objects
    // are created
    static {
        System.out.println("1. Static Block executed.");
        staticMessage = "Hello from the static block!";
    }

    // Constructor
    public StaticBlocks() {
        System.out.println("3. Constructor executed.");
        instanceMessage = "Hello from the instance!";
    }

    public static void staticMethod() {
        System.out.println("Static method called.");
    }

    public static void main(String[] args) {
        System.out.println("2. Main method started.");

        System.out.println("Accessing static variable: " + StaticBlocks.staticMessage);
        StaticBlocks.staticMethod();

        System.out.println("\nCreating first object...");
        StaticBlocks obj1 = new StaticBlocks();

        System.out.println("\nCreating second object...");
        StaticBlocks obj2 = new StaticBlocks(); // Notice the static block doesn't run again!
    }
}
