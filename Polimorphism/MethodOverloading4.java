package Polymophism;

public class MethodOverloading4 {
        static void show( int a, char ch){
            System.out.println("integer:"+a +" character"+ch);
       }
    static void show(  char ch,  int  a){
        System.out.println("character:"+ch +" integer"+a);
    }

    public static void main(String[] args) {
        show(5,'S');
    }
}
