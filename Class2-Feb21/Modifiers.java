public class Modifiers {

    // --- Access Modifiers ---

    // 1. public: Visible everywhere
    public String publicMessage = "I am public! Anyone can see me.";

    // 2. protected: Visible to the same package and all subclasses
    protected String protectedMessage = "I am protected! Subclasses and same package can see me.";

    // 3. default (no modifier): Visible only within the same package
    // (Package-Private)
    String defaultMessage = "I am default! Only classes in the same package can see me.";

    // 4. private: Visible only within this specific class
    private String privateMessage = "I am private! Only Modifiers class can see me.";

    // --- Non-Access Modifiers ---

    // final: Value cannot be changed once assigned (constant)
    public final double PI = 3.14159;

    // static: Belongs to the class rather than instances (covered in
    // StaticBlocks.java)
    public static int instanceCount = 0;

    public Modifiers() {
        instanceCount++;
    }

    // final method: Cannot be overridden by subclasses
    public final void printMessages() {
        System.out.println("--- Access Modifiers ---");
        System.out.println(publicMessage);
        System.out.println(protectedMessage);
        System.out.println(defaultMessage);
        System.out.println(privateMessage); // We can access it here because we are inside the class

        System.out.println("\n--- Non-Access Modifiers ---");
        System.out.println("Final value (PI): " + PI);
        System.out.println("Static value (instanceCount): " + instanceCount);
    }

    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        obj.printMessages();

        // Example of attempting to change a final variable (uncomment to see error)
        // obj.PI = 3.14; // ERROR: Cannot assign a value to final variable 'PI'
    }
}

// Example showing protected access
class ModifierSubclass extends Modifiers {
    public void testAccess() {
        System.out.println(publicMessage); // OK
        System.out.println(protectedMessage); // OK (inherits protected)
        System.out.println(defaultMessage); // OK (same package)
        // System.out.println(privateMessage); // ERROR: privateMessage has private
        // access in Modifiers
    }
}
