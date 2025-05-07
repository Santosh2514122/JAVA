package Constrater;
//1 default constructor
public class Default {
    int a; String b; boolean c;
    Default()//default constructor
    {
       a=100;
       b="Santosh";
       c= true;
    }
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
    class B
    {
        public static void main(String[]args)
        {
            Default obj=new Default();//object
            obj. Disp();
        }

    }
}
