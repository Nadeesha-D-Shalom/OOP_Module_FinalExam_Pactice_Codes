package OOP.ExeptionHandle.TryChatch;

public class practice {


    private double balance = 500;

    public void withdraw(double amount){
        // check balance and withdraw
        if (balance < amount)
            throw new ArithmeticException("You cannot withdraw low balance ");

        else
            balance -= amount;
    }

    public void display(){
        System.out.println("Balance : " + balance);
    }
}

class Main{
    public static void main(String[] args) {

        practice p = new practice();
        p.display(); // current balance

        try {
            p.withdraw(800);
        }
        catch (Exception e) {
            System.out.println("You cannot withdraw low balance "+e);
        }

        p.display(); // after withdraw
    }
}