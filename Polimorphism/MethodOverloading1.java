package Polymophism;
public class MethodOverloading1 //class
{
    void show(int num1)//method1
    {
        System.out.println("number 1 : " + num1);
    }
    void show(int num1, int num2)//method 2
    {
        System.out.println("number 1 : " + num1
                + "  number 2 : " + num2);
    }
    //main function
    public static void main(String[] args)
    {
        MethodOverloading1 obj = new MethodOverloading1();
        //  call method1
        obj.show(3);
        //   call method2
        obj.show(4, 5);
    }
}

