package ClassObject;
//final
class finals {
     final String s1 = "santosh1";
}
class extended extends finals {

   final String s2 = "santosh2";
}
class extended1 extends extended {

    final String s3 = "santosh3";
}

public class NonaccessModifiers2
{
    public static void main(String[] args) {
        extended obj=new  extended();// create object
        System.out.println(obj.s1);
        System.out.println(obj.s2);

    }
}
//santosh1
//santosh2
