// Parent Class (Superclass)
class Animal {
    // A method in the parent class
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}

// Child Class (Subclass) inherits from Animal
class Dog extends Animal {
    // Method Overriding: Providing a specific implementation for the inherited
    // method
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }

    // A specific method to the child class
    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class InheritanceAndOverride {
    public static void main(String[] args) {
        System.out.println("--- Inheritance and Overriding ---");

        Animal genericAnimal = new Animal();
        System.out.print("Generic Animal: ");
        genericAnimal.makeSound();

        Dog dog = new Dog();
        System.out.print("Dog: ");
        dog.makeSound(); // Calls the overridden method
        dog.sleep(); // Inherited from Animal
        dog.fetch(); // Specific to Dog

        Animal cat = new Cat(); // Polymorphism
        System.out.print("Cat: ");
        cat.makeSound(); // Calls Cat's overridden method
    }
}
