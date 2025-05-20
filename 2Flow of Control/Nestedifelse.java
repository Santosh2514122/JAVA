//nested ifelse
import java .util.Scanner;
//import java.util.function.*;
public class Nestedifelse {
    public static void main(String[]Santosh)
    {
        Scanner o=new Scanner(System. in );//object
        
        {    System.out.println("find the greatest number among  the three number:");
            System.out.println("enter the first :");
            int a=o.nextInt();
            System.out.println("enter the first :");
            int b=o.nextInt();
            System.out.println("enter the first :");
            int c=o.nextInt();
            if(a>b)
            {
                if(b>c)
                {
                    System.out.println("A is gretest number"+a);
                }
                else{
                   System.out.println("c is greatest number:"+c); 
                }
                if(b>a)
               {
                if(b>c)
                {
                    System.out.println("b is greatest number:"+b);
                }
            }

        }
    }
    }
}
