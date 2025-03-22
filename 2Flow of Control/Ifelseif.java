//if elseif 
import java .util.Scanner;
public class Ifelseif {
    public static void main(String[]agrs)
    {Scanner o=new Scanner(System .in);
        o.close();
        {
          System.out.println("enter the student marks:");
          int n=o.nextInt();
          if(n>80)
          {
            System.out.println("toper student");
          }
          else if(n<80 && n>=60)
          {
          System.out.println("first division student:");
          }
           else if(n<60 && n>35)
           {
            System.out.println("second division student:");
           }
           else{
            System.out.println("student is fail");
           }
        }
    }
}
/*
enter the student marks:
98
toper student
 */
