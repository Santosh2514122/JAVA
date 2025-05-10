package String;
public class StringReverse {
    public static void main (String[]args)
            // 1 using StrinBuffer class
    {StringBuffer obj=new StringBuffer("Santosh Yadav");
        System.out.println(obj.reverse());
        // 2using  StringBuilder class
        StringBuilder ref=new StringBuilder("Santosh Yadav");
        System.out.println(ref.reverse());
    }
}
/*
 vadaY hsotnaS
    vadaY hsotnaS
*/
