//if else statement
import java.util.Scanner;
public class Ifelse {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);  
        r.close(); 
        System.out.println("enter the  number:");
        int a= r.nextInt();
        if(a>=0)
           System.out.println("NUMBER IS POSITIVE"); 
        else
            System.out.println("NUMBER IS NEGATIVE");
     }
}
/*
 enter the  number:
22
NUMBER IS POSITIVE
 */
