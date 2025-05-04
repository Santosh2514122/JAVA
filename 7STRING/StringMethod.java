
package String;
//basic string function
public class StringMethod {
    public static void main(String[]args)
    {
        String a="SANTOSH";// String literal
        String b="bittu";// String literal
        String c="  Ajay ";

        System.out.println(a.toLowerCase());//santosh
        System.out.println(a.toUpperCase());//SANTOSH
        System.out.println(b.concat(a));//bittuSANTOSH
        System.out.println(b.length());//5
        System.out.println(c.trim());// for removing space
        String d="  ";
        System.out.println(c.isEmpty());//false
        System.out.println(a.charAt(2));
        System.out.println(a.indent('2'));//N
        System.out.println(b.equals(a));//false
        System.out.println(b.replace('b','S'));//Sittu
        System.out.println(a.compareTo(b));//-15
    }
}
