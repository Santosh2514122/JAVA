package Polymophism;

// Base class
public class MethodOverriding2 {
    void show(String a, int b) {
        System.out.println("2");
    }
}

// Subclass extending the correct class
class Bittu extends MethodOverriding2 {
    void show(String a, int b) {
        System.out.println("5");
    }

    public static void main(String[] args) {
        // object creation using MethodOverriding2 class
        MethodOverriding2 obj = new MethodOverriding2();
        obj.show("xyz", 4); // Output: 2

        // object creation using Bittu class
        Bittu obj1 = new Bittu();
        obj1.show("xyz", 3); // Output: 5
    }
}
