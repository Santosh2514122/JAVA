//basic function of string
package String;
public class Basic {

        public static void main(String args[])
        {
            // Creates a string literal
            String str = "Santosh";

            // Returns the number of
            // characters in the String.
            System.out.println(str.length());

            // Returns the character at ith index.
            System.out.println(str.charAt(3));
            System.out.println(str.substring(2));

            // Returns the substring from i to j-1 index.
            System.out.println(str.substring(2,5));
        }
    }

