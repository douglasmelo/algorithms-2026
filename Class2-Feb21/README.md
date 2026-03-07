# Class 2: Introduction to Java Fundamentals

Welcome to Class 2! In this session, we will cover the foundational building blocks of the Java programming language. 

## Topics Covered

1. **Primitive Types** (`PrimitiveTypes.java`)
   - Java is statically-typed and has 8 primitive data types mapping to raw memory: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, and `char`.
   - **Why is the maximum value of a `byte` 127?** Even though a `byte` holds 8 bits (2⁸ = 256 possible values), Java numeric primitives are *signed*. One bit is reserved as the "sign bit" to indicate whether the number is positive or negative. This splits the 256 values into 128 negative values (-128 to -1), 1 zero, and 127 positive values (1 to 127).
2. **Control Flow: Conditions** (`Conditions.java`)
   - How to make decisions in code using `if`, `else if`, `else`, `switch` statements, and the ternary operator.
3. **Control Flow: Loops** (`Loops.java`)
   - How to control the flow of execution using `for`, `while`, and `do-while` loops.
4. **Methods & Overloading** (`MethodsAndOverloading.java`)
   - Defining reusable blocks of code (methods).
   - Method Overloading: Creating multiple methods with the same name but different parameters.
5. **Inheritance & Method Overriding** (`InheritanceAndOverride.java`)
   - Object-oriented principles: How classes can inherit fields and methods from a parent class using the `extends` keyword.
   - Method Overriding: Providing a specific implementation for a method that is already defined in its superclass.
6. **Modifiers** (`Modifiers.java`)
   - Access modifiers (`public`, `protected`, `private`, `default`) that control visibility.
   - Non-access modifiers like `final` indicating constants or preventing method overriding.
7. **Static Blocks & Variables** (`StaticBlocks.java`)
   - The `static` keyword, class variables, and static initialization blocks that run when the class is loaded into memory.
8. **Finding the Maximum Element** (`BasicAlgorithm.java`)
   - A practical application of loops, arrays, and conditional statements to find the largest number in an array. This provides a gentle introduction to algorithmic thinking.
9. **Recursion** (`Recursion.java`)
   - A method calling itself to solve smaller instances of the same problem. This includes concepts such as base cases and recursive steps. Examples cover finding factorials, Fibonacci numbers, and summing arrays.


## How to read the comparison signs
==: Equal to
!=: Not equal to
>: Greater than
<: Less than
>=: Greater than or equal to
<=: Less than or equal to   

## Object-Oriented Programming (OOP)

Java is an Object-Oriented Programming (OOP) language. This paradigm organizes software design around **objects** (data) rather than functions and logic. 

Key principles of OOP in Java include:
- **Classes and Objects**: A *class* is a blueprint (like a cookie cutter) for creating *objects* (the cookies). Objects hold state (variables/fields) and behavior (methods).
- **Encapsulation**: Bundling the data (fields) and the methods that operate on the data into a single unit (class), while hiding internal details using access modifiers (like `private`, `public`, `protected`, `default` (no modifier)).
- **Inheritance**: Creating new classes from existing ones (using `extends`), promoting code reusability.
- **Polymorphism**: The ability of an object to take on many forms, typically achieved through method overriding and method overloading.
- **Abstraction**: Hiding complex implementation details and showing only the essential features of an object.

## How to Compile and Execute a Java Program

To test the examples in this directory using your terminal, follow these steps:

1.  **Open your terminal** and navigate to the folder containing the Java file:
    ```bash
    cd /path/to/algorithms-2026/Class2-Feb21
    ```
2.  **Compile the Java file** using the `javac` command. This translates your source code (`.java`) into a bytecode file (`.class`).
    ```bash
    javac PrimitiveTypes.java
    ```
3.  **Execute the compiled class** using the `java` command. Make sure not to include the `.class` extension when executing.
    ```bash
    java PrimitiveTypes
    ```

## Recommended Reading

For beginners starting out with algorithms, **"Grokking Algorithms: An illustrated guide for programmers and other curious people"** by Aditya Bhargava is highly recommended. It explains core algorithmic concepts using clear, visual illustrations and simple, practical examples rather than heavy math, making it the perfect companion for this course.

Feel free to compile and run each file individually to see its output and experiment with the code!
