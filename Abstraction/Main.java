package oopABS;

abstract class BankAccount {// class
    String name;
    String accountNumber;
    double balance;

     public BankAccount(String name, String accountNumber, double balance) // method
     {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // This method must be written by subclasses
    abstract double calculateInterest();// method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
//saving Account
class SavingsAccount extends BankAccount {
    SavingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.05; // 5% interest
    }
}
// current Account
class CurrentAccount extends BankAccount {
    CurrentAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }
    double calculateInterest() {
        return balance * 0.03; // 3% interest
    }
}
// main class
public class Main {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("Santosh ", "S123", 50000);
        BankAccount ca = new CurrentAccount("Amit", "C456", 80000);
        sa.displayInfo();
        System.out.println("Interest: ₹" + sa.calculateInterest());
        System.out.println();
        ca.displayInfo();
        System.out.println("Interest: ₹" + ca.calculateInterest());
    }
}






