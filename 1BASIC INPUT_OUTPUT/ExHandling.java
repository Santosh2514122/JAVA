package Exception;

public class ExHandling
{
    public static void main(String[] args)
    {
        try {
            System.out.println("Santosh Yadav ");
            int a = 100, b = 0, c;
            c = a / b;//ArithmeticException
            System.out.println(c);
            System.out.println("raj");
            System.out.println("ranjeet");
        }
        catch (Exception obj)//exception handing
        {

            obj.printStackTrace();//method1
           //System.out.println(obj);//method2
            //System.out.println(obj.getMessage());//method3
        }
    }
}
