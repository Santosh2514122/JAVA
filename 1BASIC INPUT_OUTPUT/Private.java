package Constrater;
//private construcor
public class Private {
    int id;
    String name;
    private  Private() { // private constructor
        id = 23;
        name = "Santosh Yadav";
        System.out.println("Name and ID: " + name + " " + id);
    }
    public static void main(String[] args) {
        Private   obj = new  Private();
    }
}
/*
class D
{ public static void main(String[] args) {
        Private   obj = new  Private();

    }
    }

 */
