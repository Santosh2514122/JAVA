package Polymophism;
public class MethodOverloading {
        void sum()// method
        {
          int a=4,b=6,c;
           c=a+b;
            System.out.println(c);
        }

        void  sum(int x,int y)
        {
             int z=x+y;
            System.out.println(z);
        }
       void sum(double p,double q)
       {
         double r=p+q;
       }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
         obj.sum(2,3);
        obj.sum(4,6);
        obj.sum(7,8);

    }
}
