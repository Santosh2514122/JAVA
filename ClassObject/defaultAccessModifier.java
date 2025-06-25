package ClassObject;
class BaseClass1 {//class

    // default method
    void Msg() {

        System.out.println("This method having defualt modifier.");
    }
}
public class defaultAccessModifier {
    public static void main(String []args){

        // Creating the object of BaseClass
        BaseClass1 obj = new BaseClass1();

        // Calling the method having defualt modifier from base class
        obj.Msg();
    }
}
//This method having defualt modifier.
