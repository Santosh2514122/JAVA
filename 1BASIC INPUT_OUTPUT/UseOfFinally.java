package Exception;

public class UseOfFinally
{
    public static void main(String[] args)
    {
        try
        {
            int data = 25 / 0;
            System.out.println(data);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("santosh ");
        }
        finally {
            System.out.println("finally block always execute");
            System.out.println("rest of the code ");
        }
    }
}
