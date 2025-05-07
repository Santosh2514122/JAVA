package Constrater;
//parametrized Constractor
public class parametrized {
    int X,Y;
    parametrized(int a,int b)//parametrized Constractor
    {
      X=a ;
      Y=b;
    }
    parametrized(int a,String b)//parametrized Constractor2
    {
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.println(X+" "+Y);
    }
}
class B
{ public static void main(String[]args )
{   parametrized  obj=new parametrized(100,200);//parametrized Constractor
     obj.show();
    parametrized  obj1=new parametrized(10,"santosh Yadav");//parametrized Constractor2 call
}

}
