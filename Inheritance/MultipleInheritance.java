package Inhetance;
//Multiple inheritance not support java (interface)
interface Coder {
    void writeCode();
}

// Interface 2 that defines testing behavior
interface Tester {
    void testCode();
}

//  in this Class implementing both interfaces
class DevOpsEngineer implements Coder, Tester {
    @Override
    public void writeCode() {
        System.out.println("Santosh .");
    }

    @Override
    public void testCode() {
        System.out.println(" Bittu.");
    }

    // Additional method specific to DevOpsEngineer
    public void deploy() {
        System.out.println("Ajay");
    }
}

// Driver class
public class MultipleInheritance {
    public static void main(String[] args) {
        DevOpsEngineer obj = new DevOpsEngineer();

        obj .writeCode();
        obj .testCode();
        obj .deploy();
    }
}


