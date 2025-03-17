public class Swap {
    public static void main(String[]args){
     int a=4,b=5;
     System.out.println("before the swap ");
     System.out.println("a= " +a+  "\tb=" +b);
     /* 
     int temp;
     temp=a;
     a=b;
     b=temp;
     */
    //second logic
    /* 
    a=a+b;//9
    b=a-b;//4
    a=a-b;//5
    */
    //third logic (xor) same  per 0 oppositive per 1
   /*
    a=a^b;
    b=a^b;
    a=a^b;
    */
    //fourth logic(*,/)
    /* 
    a=a*b;
    b=a/b;
    a=a/b;
    */
    //fift(bordmas)
    a=(a+b)-(b=a);
     System.out.println("after thr swap:");
     System.out.println(" a= " +a + "\tb="+b);
    }
}
/*
 before the swap 
a= 4    b=5
after thr swap:
 a= 5   b=4
 */
