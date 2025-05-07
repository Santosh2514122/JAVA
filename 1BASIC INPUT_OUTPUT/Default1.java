package Constrater;

public class Default1 {
    int a; String b; boolean c;
    /* Default()//default constructor
     {
        a=100;
        b="Santosh";
        c= true;
     }

     */
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
    class B
    {
        public static void main(String[]args)
        {
            Default1  obj=new Default1 ();//object
            obj. Disp();
        }

    }
}
