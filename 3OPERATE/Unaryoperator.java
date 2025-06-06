
import java.util.Scanner;
public class Uoperator {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number:");
       int a=sc.nextInt();
       System.out.println("enter the second number:");
       int b=sc.nextInt();
       sc.close();
       System.out.println("postincrement:"+(a++));
       System.out.println("preincrement:"+(++a));
       System.out.println("postincrement:"+(b--));
       System.out.println("preincrement:"+(--b));
    

    }
}
