//Bitwise operators 
import java.util.*;
public class BitwiseOperater {
  public static void main(String[]args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the number:");
    int a =obj.nextInt();
    System.out.println("enter the second number:");
        int b =obj.nextInt();
        System.out.println("Bitwise AND"+(a&b));
        System.out.println("Bitwise OR"+(a|b));
        System.out.println("Bitwise XOR"+(a^b));
        System.out.println("Bitwise XOR"+(~a));
    
  }
}
