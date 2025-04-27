package String;
//check String palindrome or not
import java .util.Scanner;
public class Palindrome {
   public static  boolean isPalindrome(String str) {
          int left = 0, right = str.length() - 1;
          while (left < right) {
               if (str.charAt(left) != str.charAt(right))
               {
                    return false;
               }
               left++;
               right--;
          }
      return true;
     }

     public static void main (String[]args)
     {
         Scanner obj=new Scanner(System.in);
          System.out.println("Enter the String");
          String str= obj.nextLine();
          if( isPalindrome(str))
          {
               System.out.println("IS a palindrome");
          }
          else {
               System.out.println("IS a not  palindrome");
          }

     }

}
