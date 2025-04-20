
import java.util.Scanner;

// Sum of two number 

public class Method2 {

 
   public static void main(String []args) {
     Scanner  obj=new Scanner( System .in );
    System.out.println(" entyer the  first nnumber ");
     int num1=obj.nextInt();
     System.out.println(" entyer the   second  nnumber ");
     int num2=obj.nextInt();
    // Method2 m=new Method2();//object cereate for method
    //m.sum(num1, num2);//method call
     // m.add(num1,num2);
     add(num1,num2);
   }
   //method sum
  public   void sum(int num1,int num2)
   {
     int c=num1+num2;
     System.out.println("sum of two number="+c);
   }
     public static    void  add(int num1,int num2)
   {
     int c=num1+num2;
     System.out.println("sum of two number="+c);
   }
}
