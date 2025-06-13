package OOP.PracticeQuestions.Question3;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.printBalance();

        try {
            bankAccount.withdraw(100);
            bankAccount.printBalance();

            bankAccount.withdraw(8000);
            bankAccount.printBalance();

        } catch (ArithmeticException e) {
            System.out.println("Insufficient Request to  Withdrew");
        }

    }
}
