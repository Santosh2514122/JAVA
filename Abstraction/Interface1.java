package oopABS;

// interface named Shape
interface Animal1 {
    void makeSound(); // abstract method
}
class Dog1 implements Animal1 {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat1 implements Animal1 {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Animal1 dog = new Dog1();  // Interface reference, Dog object
        Animal1 cat = new Cat1();  // Interface reference, Cat object

        dog.makeSound(); // Output: Dog barks
        cat.makeSound(); // Output: Cat meows
    }
}
