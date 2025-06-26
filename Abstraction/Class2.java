package oopABS;

// Working of Abstraction in Java
abstract class TV// class
{
    abstract void turnOn(); //abstract method
    abstract void turnOff();//abstract method
    void show()
    {
        System.out.println("santosh ");
    }
}
// extends  the class
class TVRemote extends TV {
    @Override//same method same signe
    void turnOn() {
        System.out.println("TV is turned ON.");
    }
    @Override//same method same signe
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }


}

// Main class to call method
public class Class2 {
    public static void main(String[] args) {
        TV remote = new TVRemote();//abstract class can not create object
        remote.turnOn();//call method
        remote.turnOff();//call method
        remote. show();

    }
}