package OOP.simpleOnlinePaymentSystem;

public class User {
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void makePayment(double amount){

        // code
        System.out.println("Generic payment made : " + amount);
    }

}
