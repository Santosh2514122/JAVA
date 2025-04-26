package String;

public class String1 {
    public static void main(String[]args)
    {
        String s1="Santosh";
        String s2="Santosh";
        if (s1==s2)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        //create object for  new string
        String s3=new String ("Santosh");
        if(s1==s2)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
