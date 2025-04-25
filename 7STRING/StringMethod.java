package String;

import java.sql.SQLOutput;

public class StringMethod {
    public static void main(String[]args)
    {
        String a="SANTOSH";
        String b="bittu";
        String c="   Ajay   ";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(b.concat(a));
        System.out.println(b.length());
        System.out.println(c.trim());
        String d=" ";
        System.out.println(c.isEmpty());
        System.out.println(a.charAt(2));
        System.out.println(a.indent('2'));
        System.out.println(b.equals(a));
        System.out.println(b.replace('b','S'));
    }
}
