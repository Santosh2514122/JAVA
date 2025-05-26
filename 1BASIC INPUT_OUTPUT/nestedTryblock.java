package Exception;

public class nestedTryblock
{
    public static void main(String[] args)
    {

            try
            {
                System.out.println("going to divide");
                int b = 39 / 0;
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
            try
            {
                int a[] = new int[5];
                a[6] = 4;
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            try{
               int  x=4/0;

            } catch (Exception e)
            {
                e.printStackTrace();
            }
    }
}
