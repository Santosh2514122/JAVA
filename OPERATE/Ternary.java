import java.util.Scanner; 
public class Ternary {
    public  static void main(String[]args)
    {
       Scanner obj=new Scanner(System.in) ;
       int max;
       System.out.println("Enter the  three value :");
       System.out.println("Enter the  value of a:");
      int a =obj.nextInt();
      System.out.println("Enter the  value of b:");
      int b=obj.nextInt();
      System.out.println("Enter the  value of c:");
      int c=obj.nextInt();
      max=(a>b)?(a>c ? a:b):(b>c ?b:c);
      System.out.println("print the largest value:"+max);
     
    }
}
