//logical operater &&,||,!
import java.util.Scanner;
public class LogicalOperater {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the  first number:");
        int a=obj.nextInt();
        System.out.println("enter the  second number:");
        int b=obj.nextInt();
        System.out.println("PERFORM THE LOGICAL OPERATER:");
        System.out.println("perform the logical AND:");
        System.out.println((a>b)&&(b>a));
        System.out.println((a>b)&&(b<a));
        System.out.println((a<b)&&(b>a));
        System.out.println((a<b)&&(b<a));
        System.out.println("perform the logical OR:");
        System.out.println((a<b)||(b>a));
        System.out.println((a>b)||(b<a));
        System.out.println((a<b)||(b>a));
        System.out.println((a<b)||(b<a));
        System.out.println("perform the logical NOT:");
        System.out.println((a>b));
        System.out.println((a<b));
    }
}
/*
enter the  first number:
1
enter the  second number:
2
PERFORM THE LOGICAL OPERATER:
perform the logical AND:
false
false
true
false
perform the logical OR:
true
false
true
true
perform the logical NOT:
false
true
 */
