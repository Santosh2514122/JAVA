//single inheritance
package Inhetance;
// Superclass
class Haraical {
    void method2() {
        System.out.println("I am Indian");
    }
}

// Subclass
class Single extends Haraical {
    void method1()
    {
        System.out.println("I am from Gorakhpur");
    }
    public static void main(String[] args) {
        Single obj = new Single();
        obj.method2(); // Calling method from superclass
        obj.method1(); // Calling method from subclass
    }
}

