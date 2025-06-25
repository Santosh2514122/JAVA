package ClassObject;
abstract class abstract1{
    abstract void myMethod();
}
abstract class abstract2 extends abstract1{ abstract void myMethod();
}


//extending abstract class
// it is use Partial definition or class method , must be extended
class MyClass extends abstract1{

    // overriding abstract method otherwise
    // code will produce error
    void myMethod(){
        System.out.println("santosh ");
    }
}
public class NonaccessModifiers3 {
    public static void main(String[] args) {
        MyClass obj=new MyClass();  //object
        obj.myMethod();
        obj.myMethod();
    }
}
