package String;

import java.util.Scanner;

public class SubSequence2 {
    static boolean isSubSeq(String s1, String s2, int n, int m) {

        if( m == 0 )
            return true;

        if( n == 0 )
            return false;

        if ( s1.charAt(n-1) == s2.charAt(m-1) )
            return isSubSeq(s1, s2, n-1, m-1);

        else
            return isSubSeq(s1,s2,n-1,m);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = sc.next();

        System.out.println("Enter the second string:");
        String s2 = sc.next();

        int n = s1.length();
        int m = s2.length();

        if (isSubSeq(s1, s2, n, m)) {
            System.out.println("Yes, it is a subsequence.");
        } else {
            System.out.println("No, it is not a subsequence.");
        }

        //sc.close();
    }
    /*
    Enter the first string:
  santosh
  Enter the second string:
  santo

     */
}
