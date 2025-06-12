package Polymophism;
public class MethodOverloading2 {
    // method  contain integer type data
    static void show(int a, int b)
    {
        System.out.println("This is integer function ");
    }
// method  contain double type data
    static void show(double a, double b)
    {
        System.out.println("This is double function ");
    }

    public static void main(String[] args)
    {
        // 1st show function
        show(1, 2);

        // 2nd show function
        show(1.2, 2.4);
    }
}
/*
  This is integer function
  This is double function
 */
