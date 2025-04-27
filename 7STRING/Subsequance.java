package String;
//iterative method
import java.util.Scanner;
class Subsequence {
    static boolean isSubSeq(String s1, String s2, int n, int m) {
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return j == m;
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
}
