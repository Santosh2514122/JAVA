
//student details 
import  java.util.Scanner;
public class Student {
    public static void main(String[]args)
    {
     Scanner scanner =new Scanner(System.in );
     System.out.println("  Enter the name of studen: ");
     String name=scanner.nextLine();
     System.out.println("Enter the id of studen:");
     int id=scanner.nextInt();
     scanner.nextLine();//Next line
     System.out.println("enter the student father name:\n");
     String father=scanner.nextLine();
     System.out.println("Enter the mothet name of student:\n");
     String mother=scanner.nextLine();
    }
    
}
