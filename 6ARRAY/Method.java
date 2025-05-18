package Array;
import java.util.Arrays;
public class Method {
    public static void main(String[]arsg)
    {
        String a[]={"santosh ","bittu","ajay"};
        //use for  1 d  array
        System.out.println("toString()"+Arrays.toString(a));
       // System.out.println("asList()"+Array.asList(a));
      int arr[][]={{10,20},{30,40}};
        System.out.println("deepString()"+Arrays.deepToString(arr));
    }
}
/*
toString()[santosh , bittu, ajay]
deepString()[[10, 20], [30, 40]]
 */
