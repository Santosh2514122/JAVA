package String;

public class Comparasition {
    public static void main(String[]args)
    {
        String a="Santosh";//String literal
        //String b="Santosh";//String literal
        String b= new String("Santosh");//new keyword
         if(a.equals(b))//compair reference variable
         {
             System.out.println("true");
         }
         else
         {
             System.out.println("false");
         }
    }
}
