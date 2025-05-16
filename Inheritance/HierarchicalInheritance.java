package Inhetance;
//Hierarchical inheritance
class A
{
    public void print_A() { System.out.println("Class A"); }
}

class B extends A
{
    public void print_B() { System.out.println("Class B"); }
}

class C extends A

{
    public void print_C() { System.out.println("Class C"); }
}

class D extends A
{
    public  void print_D() { System.out.println("Class D"); }
}

  //Drive class
   public class HierarchicalInheritance {
    public static void main(String[] args) {
     B obj=new B();// create object for nonstatic method
        obj.print_A();
        obj. print_B();

        C objC =new C();
        objC.print_A();
        objC.print_C();

        D objD =new D();
        objD.print_A();
        objD. print_D();
    }
}
/*
Class A
Class B
Class A
Class C
Class A
Class D

 */