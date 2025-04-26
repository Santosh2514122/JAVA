package String;

public class String5 {
    public static void main(String args[])
    {
        // Creating two string literals
        String s1 = "Santosh";
        String s2 = s1;
        s1 = s1 + "SantoshYadav";
        // or
        // s1 = s1.concat("forgeeks");
        System.out.println(s1);
        // object "geeksforgeeks"
        System.out.println(s1 == s2);
    }
}
/*
SantoshSantoshYadav
false
 */
