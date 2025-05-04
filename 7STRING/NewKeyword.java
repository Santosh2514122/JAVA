package String;
//new keyword
public class NewKeyword {
    public static void main(String[]args)
    {
        String a=new String("Santosh");
        System.out.println(a);
        String b=new String("Santosh");//heap section in memory
        System.out.println(b);
        a.concat("Yadav");// emutable(a=)
        System.out.println(a);
    }
}
