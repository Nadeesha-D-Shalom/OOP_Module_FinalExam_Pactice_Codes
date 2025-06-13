package OOP.SOLID_Principles.Example1;

public class BankAccount {

    private int balance; // 100

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) { // 40
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

}
