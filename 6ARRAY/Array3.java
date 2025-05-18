package Array;

public class Array3 {
    void leader(int arr[], int n)
    {
        System.out.println("Leader elements are:");

        int current = arr[n - 1]; // last element is always a leader
        System.out.print(current + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > current) {
                current = arr[i];
                System.out.print(current + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        Array3 obj = new Array3();// create object for nonstatic method
        obj.leader(arr, n);
    }
}
