package Polymophism;
// number of def arguments
public class Overloding {
     void show(int a,int b)// method1(2)
     {
         System.out.println("1");
     }
    void show(int a)//method2 (1)
    {
        System.out.println("2");
    }
    public static void main(String[] args)
    {
        Overloding obj=new Overloding();
        obj.show(5,4);
    }
}
