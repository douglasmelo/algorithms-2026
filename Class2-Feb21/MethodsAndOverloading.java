public class MethodsAndOverloading {

    // A simple method that takes no arguments and returns nothing (void)
    public void sayHello() {
        System.out.println("Hello! No arguments provided.");
    }

    // Overloaded method: Same name, but takes one String argument
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method: Same name, but takes two arguments and returns an int
    public int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method: Same name, but takes three arguments
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MethodsAndOverloading demo = new MethodsAndOverloading();

        System.out.println("--- Method Overloading ---");

        // Calling the overloaded sayHello methods
        demo.sayHello();
        demo.sayHello("Alice");

        // Calling the overloaded multiply methods
        int prod1 = demo.multiply(5, 4);
        int prod2 = demo.multiply(2, 3, 4);

        System.out.println("Product of 2 numbers: " + prod1);
        System.out.println("Product of 3 numbers: " + prod2);
    }
}
