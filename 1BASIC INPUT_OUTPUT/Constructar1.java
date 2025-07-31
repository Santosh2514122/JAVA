//default constructar
package Basic;
public class Constructar1 {
    int id;
    String name;
    public void disp()
    {
        System.out.println(name+""+id);
    }
    Constructar1()
    {
        id=23;
        name="Santosh Yadav";
    }
    public static void main(String[] args) {
        Constructar1 obj=new Constructar1();
        obj.disp();
    }
}
