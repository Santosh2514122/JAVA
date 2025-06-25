package ClassObject;
//  NonAccessModifiers use in  variable ,class,method or block
// NonAccessModifiers(7 type )
//  static,final ,3abstract,4synchronized,5 volatile,6. transient,6. 7transient
//static>>  it is Shared by all objects, class-level
public class NonAccessModifiers1
{
    static int count = 0; // shared by all objects
    static void show()
    {
        System.out.println("Static method");
    }
    public static void main(String[] args)
    {
        show();//call method
    }
}
//Static method