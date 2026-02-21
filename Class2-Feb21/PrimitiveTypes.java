public class PrimitiveTypes {
    public static void main(String[] args) {
        // Integer types
        byte aByte = 127;           // 8-bit
        short aShort = 32767;       // 16-bit
        int anInt = 2147483647;     // 32-bit (most common)
        long aLong = 9223372036854775807L; // 64-bit

        // Floating-point types
        float aFloat = 3.14f;       // 32-bit
        double aDouble = 3.14159265359; // 64-bit (most common)

        // Character type
        char aChar = 'A';           // 16-bit Unicode

        // Boolean type
        boolean aBoolean = true;    // true or false

        // String (Reference Type, but often taught alongside primitives)
        String aString = "Hello, Java!";

        System.out.println("--- Primitive Types in Java ---");
        System.out.println("Byte: " + aByte);
        System.out.println("Short: " + aShort);
        System.out.println("Int: " + anInt);
        System.out.println("Long: " + aLong);
        System.out.println("Float: " + aFloat);
        System.out.println("Double: " + aDouble);
        System.out.println("Char: " + aChar);
        System.out.println("Boolean: " + aBoolean);
        System.out.println("\n--- Reference Type ---");
        System.out.println("String: " + aString);
    }
}
