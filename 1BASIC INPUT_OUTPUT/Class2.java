package Class;

import Basic.Class;

public class Class2 {
    public void eats()//method1
    {
        System.out.println("Santosh Yadav");
    }
    public static void main(String[] args)//main function
    {
        System.out.println("Ajay");
        Basic.Class dog=new Class();//object
        dog.eats();
        dog.run();
        Birds sp=new  Birds();//object
        sp.fly();
    }
    public void run()//method
    {
        System.out.println("i am bittu");
    }
}
class Birds
{
    void fly()
    {
        System.out.println(" i am fliy");
    }
}
