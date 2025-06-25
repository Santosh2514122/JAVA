package ClassObject;
  class BaseClass{
      protected void Mgs()//method
      {
          System.out.println("this is protected method");
      }
  }
public class ProtectedAccessM { //class
    public static void main(String[] args) {
        BaseClass obj=new BaseClass();
        obj.Mgs();
    }
}
