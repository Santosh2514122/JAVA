
public class Variable {
    static int b=30;//Static variable
    int c=40;//instance variable
    public static void main(String[]args)
    {
    int a=20;//local variale
    Variable ref=new Variable();
    System.out.println(a);// local direct access
    System.out.println(Variable.b);//static variable acces with help of class
    System.out.println(ref.c);//instance variable access with help  object
    }
}
