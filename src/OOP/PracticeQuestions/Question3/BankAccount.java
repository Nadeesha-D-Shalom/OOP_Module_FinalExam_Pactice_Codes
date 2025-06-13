package OOP.PracticeQuestions.Question3;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance = 500;

    public void withdraw(double amount){
        if (amount > balance)
            throw new ArithmeticException ();

        else
            balance -= amount;
    }

    public void printBalance(){
        System.out.println("Account balance is: " + balance);
    }
}
