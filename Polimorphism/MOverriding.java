package Polymophism;
public class MOverriding// class
{
      public Object show()
        {
            System.out.println("1");
            return  null;
        }
}
   class Xyz extends MOverriding
   {
      public   String show()
        {
            System.out.println("2");
           return null;
        }
       public static void main(String[] args) {
           MOverriding obj = new MOverriding();
           obj.show();
       }
   }
