package Polymophism;

// type of argument
public class Sequenceoverloding {

    void show(int a) // method 1
    {
        System.out.println("1");
    }

    void show(String a) // method 2
    {
        System.out.println("santosh");
    }

    public static void main(String[] args) {
        // create object for Class name
        Sequenceoverloding obj = new Sequenceoverloding(); // Corrected class name
        obj.show("abc"); // This will call method 2
    }
}
