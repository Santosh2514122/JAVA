//private construtor
package Basic;
public class Constructor2 {
    int id;
    String name;

    private void display() { // private constructor
        id = 23;
        name = "Santosh Yadav";
        System.out.println("Name and ID: " + name + " " + id);
    }
    public static void main(String[] args) {
        Constructor2 obj = new Constructor2();
        obj.display();
    }
}
