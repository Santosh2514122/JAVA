package Array;

public class Array {
        public static void main(String[] args) {
            int[][] a = { {10, 20}, {30, 40, 50}  };
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) { // fixed loop condition
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

