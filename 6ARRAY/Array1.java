package Array;
import java.util.Scanner;
public class Array1 {    //class name
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);// create  Scanner class name  object for input
        int marks[]=new int[5];
        System.out.println("enter the array element ");
        for(int i=0;i<5;i++)
        {
            marks[i]=obj.nextInt();
        }
        System.out.println("Array  element is ");
        for(int i=0;i<5;i++) //for print
        {
            System.out.println(marks[i]);
        }
    }
}


