package SOLID_Principles.Example1;


public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(100);
        bankAccount.withdraw(40);

        int balance = bankAccount.getBalance();


        StatementPrintable stp = new StatementPrintable();
        stp.printStatement(balance);


    }
}

