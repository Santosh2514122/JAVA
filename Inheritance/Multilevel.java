package Inhetance;//package
// grant parent
 class Multilevel0
{
     void method3()
     {
         System.out.println("Harinam");
     }
 }
 //parent
    class Multilevel1 extends Multilevel0
    {
         void method2()
         {
             System.out.println("Santosh");
         }
    }
//child class
     class Multilevel2 extends Multilevel1
     {
          void method1()//method
         {
             System.out.println("raj");
         }
     }
     // main or drive class in call
     class Multilevel
     {
         public static void main (String args[])
         {
             Multilevel2 obj=new Multilevel2();//create object for nonstatic method
             obj.method3();
             obj.method2();
             obj.method1();
         }
     }

