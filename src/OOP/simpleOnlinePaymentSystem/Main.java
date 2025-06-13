package OOP.simpleOnlinePaymentSystem;

public class Main {
    public static void main(String[] args) {

        User u1 = new RegularUser("Nadeesha",500.00);
        User u2 = new PremiumUser("Shalom",2500.22);

        u1.makePayment(500.0);
        u2.makePayment(1000.00);
    }
}
