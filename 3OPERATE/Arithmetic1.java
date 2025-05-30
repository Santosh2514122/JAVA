import java.util.Scanner;
public class Arithmetic1
    {
    public static void main(String[]args)
    {  Scanner obj =new Scanner(System.in);
      System.out.println("enter the first number:");
      int a=obj.nextInt();
      System.out.println("enter the second Number :");
      int b=obj.nextInt();
      int sum=a+b;
      int mul=a*b;
      int div=a/b;
      int modul=a%b;
      System.out.println("sum="+sum);
      System.out.println("mul="+mul);
      System.out.println("div="+div);
      System.out.println("modul="+modul);
    }
    }

