//increment or decrement operater
import java.util.Scanner;
public class IncrementOperater {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("entter the number:");
        int a =obj.nextInt();
       // System.out.println("enter the second number:");
        //int b=obj.nextInt();
        System.out.println("a++: "+(a++));
        System.out.println("++a: "+(++a));
        System.out.println("a--: "+(a--));
        System.out.println("--a: "+(--a));
    }
}
/*
entter the number:
10
a++: 10
++a: 12
a--: 12
--a: 10
 */